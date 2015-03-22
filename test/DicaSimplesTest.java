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

public class DicaSimplesTest {
    public final GenericDAO dao = new GenericDAO();
    private Result result;
    public EntityManager em;

    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;
    private Usuario usuario4;
    private DicaComoNaoTerDificuldade dica1;
    private DicaComoNaoTerDificuldade dica2;
    private DicaComoNaoTerDificuldade dica3;
    private DicaConselho dica4;
    private DicaConselho dica5;
    private DicaConselho dica6;
    private DicaDisciplinasAnteriores dica7;
    private DicaDisciplinasAnteriores dica8;
    private DicaDisciplinasAnteriores dica9;
    private DicaMaterialUtil dica10;
    private DicaMaterialUtil dica11;
    private DicaMaterialUtil dica12;

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
        // Cria algumas dicas a serem inseridas no banco de dados
        dica1 = new DicaComoNaoTerDificuldade("Java", usuario1, "Saber Java é essencial.");
        dica2 = new DicaComoNaoTerDificuldade("Programação", usuario2, "Programar é necessário.");
        dica3 = new DicaComoNaoTerDificuldade("Eclipe", usuario3, "Conheça uma ferramenta de trabalho.");
        dica4 = new DicaConselho("Procure os monitores.", usuario4, "Monitores ajudam bastante.");
        dica5 = new DicaConselho("Estude com frequência.", usuario1, "Tem que estudar sempre.");
        dica6 = new DicaConselho("Pegue livros na biblioteca.", usuario2, "A biblioteca está aberta.");
        dica7 = new DicaDisciplinasAnteriores("Pre-requisitos", usuario3, "P2, LP2", "Conteúdo base para este tema.");
        dica8 = new DicaDisciplinasAnteriores("P2", usuario4, "P2, LP2", "Conteúdo base para este tema.");
        dica9 = new DicaDisciplinasAnteriores("LP2", usuario1, "P2, LP2", "Conteúdo base para este tema.");
        dica10 = new DicaMaterialUtil("Site da universidade", usuario2, "www.ufcg", ".edu.br");
        dica11 = new DicaMaterialUtil("Site da disciplina", usuario3, "www.si1", ".com.br");
        dica12 = new DicaMaterialUtil("Site do Portal do Leite", usuario4, "www.milkportal", ".com");
    }

    @Test
    public void devePostarDica() throws Exception {
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
        Tema GoF = (Tema) dao.findByAttributeName("Tema", "nome", "GoF").get(0);
        assertThat(GoF.getNumeroDicas()).isEqualTo(0);

        // Verifico que os temas no banco de dados ainda não tem dicas
        Tema OObd = (Tema) dao.findByAttributeName("Tema", "nome", "OO").get(0);
        assertThat(OObd.getNumeroDicas()).isEqualTo(0);
        Tema GRASPbd = (Tema) dao.findByAttributeName("Tema", "nome", "GRASP").get(0);
        assertThat(GRASPbd.getNumeroDicas()).isEqualTo(0);
        Tema GoFbd = (Tema) dao.findByAttributeName("Tema", "nome", "GoF").get(0);
        assertThat(GoFbd.getNumeroDicas()).isEqualTo(0);

        // Adiciona dicas ao tema OO e atualiza o banco de dados
        OO.addDica(dica1);
        OO.addDica(dica4);
        OO.addDica(dica7);
        OO.addDica(dica10);
        dao.merge(OO);

        // Verifica que as dicas realmente foram inseridas no banco de dados
        OObd = (Tema) dao.findByAttributeName("Tema", "nome", "OO").get(0);
        assertThat(OObd.getNumeroDicas()).isEqualTo(4);

        // Adiciona dicas ao tema GRASP e atualiza o banco de dados
        GRASP.addDica(dica2);
        GRASP.addDica(dica5);
        GRASP.addDica(dica8);
        GRASP.addDica(dica11);
        dao.merge(GRASP);

        // Verifica que as dicas realmente foram inseridas no banco de dados
        GRASPbd = (Tema) dao.findByAttributeName("Tema", "nome", "GRASP").get(0);
        assertThat(GRASPbd.getNumeroDicas()).isEqualTo(4);

        // Adiciona dicas ao tema GoF e atualiza o banco de dados
        GoF.addDica(dica3);
        GoF.addDica(dica6);
        GoF.addDica(dica9);
        GoF.addDica(dica12);
        dao.merge(GoF);

        // Verifica que as dicas realmente foram inseridas no banco de dados
        GoFbd = (Tema) dao.findByAttributeName("Tema", "nome", "GoF").get(0);
        assertThat(GoFbd.getNumeroDicas()).isEqualTo(4);

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
