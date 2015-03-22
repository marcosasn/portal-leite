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

    }

    @Test
    public void devePostarMetaDica() throws Exception {

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
