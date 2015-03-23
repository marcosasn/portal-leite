package test.models;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import models.*;
import models.dao.*;
import org.junit.Test;
import scala.Option;
import play.db.jpa.JPA;
import play.db.jpa.JPAPlugin;
import play.mvc.Result;
import play.test.FakeApplication;
import play.test.Helpers;
import javax.persistence.EntityManager;

import static org.fest.assertions.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Win7 on 3/23/2015.
 */
public class DicasMaisUteisTeste {
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

    private Concordancia conc1;
    private Concordancia conc2;
    private Concordancia conc3;
    private Concordancia conc4;

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

    @Before
    public void criaInstancias() {
        usuario1 = new models.Usuario("Adolfo", "adolfo06", "123");
        usuario2 = new models.Usuario("Marcos", "marcosasn", "123");
        usuario3 = new models.Usuario("José", "jose123", "123");
        usuario4 = new models.Usuario("Maria", "mariazinha", "123");

        dica1 = new DicaComoNaoTerDificuldade("Java", usuario1, "Saber Java é essencial.");
        dica2 = new DicaConselho("Procure os monitores.", usuario4, "Monitores ajudam bastante.");
        dica3 = new DicaDisciplinasAnteriores("Pre-requisitos", usuario3, "P2, LP2", "Conteúdo base para este tema.");
        dica4 = new DicaMaterialUtil("Site da universidade", usuario2, "www.ufcg", ".edu.br");

        dica5 = new MetaDica("Meta-Dica 1", usuario1, "Olhem estas dicas");
        dica6 = new MetaDica("Meta-Dica 2", usuario2, "Olhem estas dicas interessantes");

        conc1 = new Concordancia(usuario1);
        conc2 = new Concordancia(usuario2);
        conc3 = new Concordancia(usuario3);
        conc4 = new Concordancia(usuario4);
    }

    @Test
    public void temasDevemIniciarSemDica() {
        List<Tema> temas = dao.findAllByClassName(Tema.class.getName());
        assertThat(temas.size()).isEqualTo(12);

        for (Tema tema : temas) {
            Assert.assertTrue(tema.getDicas().size() == 0);
            Assert.assertTrue(tema.getNumeroDicas() == 0);
            tema.ordenarTopConcordancias();
            Assert.assertTrue(tema.getDicas().isEmpty());
        }
    }

    @After
    public void tearDown() {
        em.getTransaction().commit();
        JPA.bindForCurrentThread(null);
        em.close();
    }
}
