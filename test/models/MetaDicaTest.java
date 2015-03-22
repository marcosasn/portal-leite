package models;

import models.*;
import models.dao.GenericDAO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import play.db.jpa.JPA;
import play.db.jpa.JPAPlugin;
import play.mvc.Result;
import play.test.FakeApplication;
import play.test.Helpers;
import scala.Option;
import javax.persistence.EntityManager;
import models.Usuario;
import static org.fest.assertions.Assertions.*;
import java.util.List;

public class MetaDicaTest {
    public final GenericDAO dao = new GenericDAO();
    private Result result;
    public EntityManager em;

    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;
    private Usuario usuario4;

    private DicaComoNaoTerDificuldade dica1;
    private DicaConselho dica2;
    private DicaDisciplinasAnteriores dica3;
    private DicaMaterialUtil dica4;
    private MetaDica dica5;
    private MetaDica dica6;

    @Before
    public void criaUsuarios() {
        // Cria alguns usuários para serem utilizados nos testes
        usuario1 = new Usuario("Adolfo", "adolfo06", "123");
        usuario2 = new Usuario("Marcos", "marcosasn", "123");
        usuario3 = new Usuario("José", "jose123", "123");
        usuario4 = new Usuario("Maria", "mariazinha", "123");
    }

    @Before
    public void criaDicas() {
        dica1 = new DicaComoNaoTerDificuldade("Java", usuario1, "Saber Java é essencial.");
        dica2 = new DicaConselho("Procure os monitores.", usuario4, "Monitores ajudam bastante.");
        dica3 = new DicaDisciplinasAnteriores("Pre-requisitos", usuario3, "P2, LP2", "Conteúdo base para este tema.");
        dica4 = new DicaMaterialUtil("Site da universidade", usuario2, "www.ufcg", ".edu.br");
        dica5 = new MetaDica("Meta-Dica 1", usuario1, "Olhem estas dicas");
        dica6 = new MetaDica("Meta-Dica 2", usuario2, "Olhem estas dicas interessantes");
    }

    @Test
    public void devePostarMetaDica() throws Exception {
        // Verifica que existe 1 disciplina ao inicializar o sistema
        List<Disciplina> disciplinas = dao.findAllByClassName(Disciplina.class.getName());
        assertThat(disciplinas.size()).isEqualTo(1);

        // Verifica que existem 12 temas (da disciplina Sistemas de Informação I) ao inicializar o sistema
        List<Tema> temas = dao.findAllByClassName(Tema.class.getName());
        assertThat(temas.size()).isEqualTo(12);

        // Recupera-se a disciplina previamente cadastrada no sistema junto com alguns temas
        Disciplina SI1 = (Disciplina) dao.findByAttributeName("Disciplina", "nome", "Sistemas de Informação I").get(0);
        assertThat(SI1.getTemas().size()).isEqualTo(12);
        Tema OO = (Tema) dao.findByAttributeName("Tema", "nome", "OO").get(0);
        assertThat(OO.getNumeroDicas()).isEqualTo(0);
        Tema GRASP = (Tema) dao.findByAttributeName("Tema", "nome", "GRASP").get(0);
        assertThat(GRASP.getNumeroDicas()).isEqualTo(0);

        // Verifico que os temas no banco de dados ainda não tem dicas
        Tema OObd = (Tema) dao.findByAttributeName("Tema", "nome", "OO").get(0);
        assertThat(OObd.getNumeroDicas()).isEqualTo(0);
        Tema GRASPbd = (Tema) dao.findByAttributeName("Tema", "nome", "GRASP").get(0);
        assertThat(GRASPbd.getNumeroDicas()).isEqualTo(0);

        dao.persist(dica1);
        dao.persist(dica2);
        dao.persist(dica3);
        dao.persist(dica4);
        dao.persist(dica5);
        dao.persist(dica6);

        // Adiciona dicas ao tema OO e atualiza o banco de dados
        OO.addDica(dica1);
        OO.addDica(dica2);
        dao.merge(OO);

        // Adiciona dicas ao tema GRASP e atualiza o banco de dados
        GRASP.addDica(dica3);
        GRASP.addDica(dica4);
        dao.merge(GRASP);

        // Verifico que os temas no banco de dados agora têm dicas
        OObd = (Tema) dao.findByAttributeName("Tema", "nome", "OO").get(0);
        assertThat(OObd.getNumeroDicas()).isEqualTo(2);
        GRASPbd = (Tema) dao.findByAttributeName("Tema", "nome", "GRASP").get(0);
        assertThat(GRASPbd.getNumeroDicas()).isEqualTo(2);

        // Verifico que a disciplina Sistemas de Informação I ainda não tem meta-dicas
        SI1 = (Disciplina) dao.findByAttributeName("Disciplina", "nome", "Sistemas de Informação I").get(0);
        assertThat(SI1.getNumeroMetaDicas()).isEqualTo(0);

        // Adiciono dicas à primeira meta-dica (dicas de temas diferentes)
        dica5.adicionaDica(dica1); // Dica simples
        dica5.adicionaDica(dica3); // Dica simples
        dao.merge(dica5);

        // Adiciono a meta-dica à disciplina Sistemas de Informação I
        SI1.addMetaDica(dica5);
        dao.merge(SI1);

        // Verifico que a disciplina Sistemas de Informação I agora tem uma meta-dica no banco de dados
        SI1 = (Disciplina) dao.findByAttributeName("Disciplina", "nome", "Sistemas de Informação I").get(0);
        assertThat(SI1.getNumeroMetaDicas()).isEqualTo(1);

        // Verifico que as dicas foram realmente adicionadas à meta-dica no banco de dados
        DicaComoNaoTerDificuldade dica1bd = (DicaComoNaoTerDificuldade) dao.findByAttributeName("DicaComoNaoTerDificuldade", "titulo", "Java").get(0);
        DicaDisciplinasAnteriores dica3bd = (DicaDisciplinasAnteriores) dao.findByAttributeName("DicaDisciplinasAnteriores", "titulo", "Pre-requisitos").get(0);
        MetaDica dica5bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 1").get(0);

        assertThat(dica1).isEqualTo(dica1bd);
        assertThat(dica3).isEqualTo(dica3bd);

        List<IDica> listaDeDicasDaMetaDica5 = dica5bd.getListaDicas();
        assertThat(listaDeDicasDaMetaDica5).contains(dica1bd);
        assertThat(listaDeDicasDaMetaDica5).contains(dica3bd);

        // Adiciono dicas simples e a primeira meta-dica à segunda meta-dica (dicas de temas diferentes)
        dica6.adicionaDica(dica2); // Dica simples
        dica6.adicionaDica(dica4); // Dica simples
        dica6.adicionaDica(dica5); // Meta-dica
        dao.merge(dica6);

        // Adiciono a meta-dica à disciplina Sistemas de Informação I
        SI1.addMetaDica(dica6);
        dao.merge(SI1);

        // Verifico que a disciplina Sistemas de Informação I agora tem duas meta-dica no banco de dados
        SI1 = (Disciplina) dao.findByAttributeName("Disciplina", "nome", "Sistemas de Informação I").get(0);
        assertThat(SI1.getNumeroMetaDicas()).isEqualTo(2);

        // Verifico que as dicas foram realmente adicionadas à meta-dica no banco de dados
        DicaConselho dica2bd = (DicaConselho) dao.findByAttributeName("DicaConselho", "titulo", "Procure os monitores.").get(0);
        DicaMaterialUtil dica4bd = (DicaMaterialUtil) dao.findByAttributeName("DicaMaterialUtil", "titulo", "Site da universidade").get(0);
        MetaDica dica6bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 2").get(0);

        assertThat(dica2).isEqualTo(dica2bd);
        assertThat(dica4).isEqualTo(dica4bd);
        assertThat(dica5).isEqualTo(dica5bd);

        List<IDica> listaDeDicasDaMetaDica6 = dica6bd.getListaDicas();
        assertThat(listaDeDicasDaMetaDica6).contains(dica2bd);
        assertThat(listaDeDicasDaMetaDica6).contains(dica4bd);
        assertThat(listaDeDicasDaMetaDica6).contains(dica5bd);
    }

    @Before
    public void setUp() {
        //Using Global.java to the tests
        FakeApplication app = Helpers.fakeApplication();
        Helpers.start(app);
        Option<JPAPlugin> jpaPlugin = app.getWrappedApplication().plugin(JPAPlugin.class);
        em = jpaPlugin.get().em("default");
        JPA.bindForCurrentThread(em);
        em.getTransaction().begin();
    }

    @After
    public void tearDown() {
        em.getTransaction().commit();
        JPA.bindForCurrentThread(null);
        em.close();
    }
}
