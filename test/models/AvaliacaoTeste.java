package test.models;

import models.*;
import models.dao.GenericDAO;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import play.db.jpa.JPA;
import play.db.jpa.JPAPlugin;
import play.mvc.Result;
import play.test.FakeApplication;
import play.test.Helpers;
import scala.Option;

import javax.persistence.EntityManager;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class AvaliacaoTeste {
    public final GenericDAO dao = new GenericDAO();
    private Result result;
    public EntityManager em;

    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;

    private Disciplina si1;

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
    public void criaUsuarios() {
        usuario1 = new Usuario("Adolfo", "adolfo06", "123");
        usuario2 = new Usuario("Marcos", "marcosasn", "123");
        usuario3 = new Usuario("José", "jose123", "123");
    }

    @Before
    public void recuperaDisciplina() {
        List<Disciplina> disciplinas = dao.findAllByClassName(Disciplina.class.getName());
        assertThat(disciplinas.size()).isEqualTo(1);

        List<Tema> temas = dao.findAllByClassName(Tema.class.getName());
        assertThat(temas.size()).isEqualTo(12);

        si1 = (Disciplina) dao.findByAttributeName("Disciplina", "nome", "Sistemas de Informação I").get(0);
    }

    @Test
    public void deveAdicionarAvaliacao() {
        List<Tema> temas = dao.findAllByClassName(Tema.class.getName());
        assertThat(temas.size()).isEqualTo(12);

        for(Tema tema: temas) {
            tema.addAvaliacao(usuario1.getLogin(), -2);
            Assert.assertTrue(tema.getNumeroAvaliacoes() == 1);
            Assert.assertTrue(tema.getMedia() == -2);
            Assert.assertTrue(tema.getMediana() == -2);
        }
    }

    @After
    public void tearDown() {
        em.getTransaction().commit();
        JPA.bindForCurrentThread(null);
        em.close();
    }
}
