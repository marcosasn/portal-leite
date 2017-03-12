package models;

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

import java.util.HashMap;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class AvaliacaoTeste {
    public final GenericDAO dao = new GenericDAO();
    private Result result;
    public EntityManager em;

    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;

    @Before
    public void setUp() {
        //Using Global.java to the tests
        FakeApplication app = Helpers.fakeApplication();
        Helpers.start(app);
        Option<JPAPlugin> jpaPlugin = app.getWrappedApplication().plugin(JPAPlugin.class);
        em = jpaPlugin.get().em("default");
        JPA.bindForCurrentThread(em);
        em.getTransaction().begin();

        usuario1 = new Usuario("Adolfo", "adolfo06", "123");
        usuario2 = new Usuario("Marcos", "marcosasn", "123");
        usuario3 = new Usuario("José", "jose123", "123");
    }

    @Test
    public void deveIniciarComUmaDisciplinaComTemas() {
        List<Disciplina> disciplinas = dao.findAllByClassName(Disciplina.class.getName());
        assertThat(disciplinas.size()).isEqualTo(1);

        List<Tema> temas = dao.findAllByClassName(Tema.class.getName());
        assertThat(temas.size()).isEqualTo(12);
    }

    @Test
    public void deveIniciarSemAvaliacao() {
        List<Tema> temas = dao.findAllByClassName(Tema.class.getName());
        assertThat(temas.size()).isEqualTo(12);

        for(Tema tema: temas) {
            Assert.assertFalse(tema.isAvaliado(usuario1.getLogin()));
            Assert.assertFalse(tema.isAvaliado(usuario2.getLogin()));
            Assert.assertFalse(tema.isAvaliado(usuario3.getLogin()));
            Assert.assertTrue(tema.getNumeroAvaliacoes() == 0);
            Assert.assertTrue(tema.getMedia() == 0);
            Assert.assertTrue(tema.getMediana() == 0);
        }
    }

    @Test
    public void deveAdicionarAvaliacao() {
        List<Tema> temas = dao.findAllByClassName(Tema.class.getName());
        assertThat(temas.size()).isEqualTo(12);

        for(Tema tema: temas) {
            tema.addAvaliacao(usuario1.getLogin(), -2);
            Assert.assertTrue(tema.isAvaliado(usuario1.getLogin()));
            Assert.assertFalse(tema.isAvaliado(usuario2.getLogin()));
            Assert.assertTrue(tema.getNumeroAvaliacoes() == 1);
            Assert.assertTrue(tema.getMedia() == -2);
            Assert.assertTrue(tema.getMediana() == -2);
        }

        for(Tema tema: temas) {
            tema.addAvaliacao(usuario2.getLogin(), 2);
            Assert.assertTrue(tema.isAvaliado(usuario1.getLogin()));
            Assert.assertTrue(tema.isAvaliado(usuario2.getLogin()));
            Assert.assertTrue(tema.getNumeroAvaliacoes() == 2);
            Assert.assertTrue(tema.getMedia() == 0);
            Assert.assertTrue(tema.getMediana() == 0);
        }
    }

    @Test
    public void deveAvaliarUmaVezPorUsuario() {
        List<Tema> temas = dao.findAllByClassName(Tema.class.getName());
        assertThat(temas.size()).isEqualTo(12);

        for(Tema tema: temas){
            tema.addAvaliacao(usuario1.getLogin(), -2);
            Assert.assertTrue(tema.isAvaliado(usuario1.getLogin()));
            Assert.assertFalse(tema.isAvaliado(usuario2.getLogin()));
            Assert.assertTrue(tema.getNumeroAvaliacoes() == 1);
            Assert.assertTrue(tema.getMedia() == -2);
            Assert.assertTrue(tema.getMediana() == -2);
            Assert.assertTrue(tema.getAvaliacoes().get(usuario1.getLogin()) == -2);
        }

        for(Tema tema: temas){
            tema.addAvaliacao(usuario1.getLogin(), 2);
            Assert.assertTrue(tema.isAvaliado(usuario1.getLogin()));
            Assert.assertFalse(tema.isAvaliado(usuario2.getLogin()));
            Assert.assertTrue(tema.getNumeroAvaliacoes() == 1);
            Assert.assertTrue(tema.getMedia() == 2);
            Assert.assertTrue(tema.getMediana() == 2);
            Assert.assertTrue(tema.getAvaliacoes().get(usuario1.getLogin()) == 2);
        }

        for(Tema tema: temas){
            tema.addAvaliacao(usuario2.getLogin(), 1);
            Assert.assertTrue(tema.isAvaliado(usuario1.getLogin()));
            Assert.assertTrue(tema.isAvaliado(usuario2.getLogin()));
            Assert.assertTrue(tema.getNumeroAvaliacoes() == 2);
            Assert.assertEquals(1.5, tema.getMedia(), 0);
            Assert.assertEquals(1.5, tema.getMediana(), 0);
            Assert.assertTrue(tema.getAvaliacoes().get(usuario2.getLogin()) == 1);
        }

        for(Tema tema: temas){
            Assert.assertTrue(tema.isAvaliado(usuario1.getLogin()));
            Assert.assertTrue(tema.isAvaliado(usuario2.getLogin()));
            Assert.assertTrue(tema.getNumeroAvaliacoes() == 2);
            Assert.assertEquals(1.5, tema.getMedia(), 0.0);
            Assert.assertEquals(1.5, tema.getMediana(), 0.0);
            Assert.assertTrue(tema.getAvaliacoes().get(usuario1.getLogin()) == 2);
            Assert.assertTrue(tema.getAvaliacoes().get(usuario2.getLogin()) == 1);
        }
    }

    @After
    public void tearDown() {
        em.getTransaction().commit();
        JPA.bindForCurrentThread(null);
        em.close();
    }
}