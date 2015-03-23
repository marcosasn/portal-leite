package controllers;

import com.google.common.collect.ImmutableMap;
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

import static org.fest.assertions.Assertions.*;
import static play.test.Helpers.*;

public class LoginTest {

    private Result result;
    public EntityManager em;

    @Test
    public void deveLogar() {

        //Usuário é cadastrado
        result = callAction(
                controllers.routes.ref.Cadastro.registrar(),
                fakeRequest().withFormUrlEncodedBody(ImmutableMap.of(
                        "nome", "Adolfo",
                        "login", "adolfo06",
                        "senha", "123"))
        );

        // Usuário faz login
        result = callAction(
                controllers.routes.ref.Login.logar(),
                fakeRequest().withFormUrlEncodedBody(ImmutableMap.of(
                        "login", "adolfo06",
                        "senha", "123"))
        );

        assertThat(session(result).get("login")).isEqualTo("adolfo06");
    }

    @Test
    public void deveFazerLogout() {

        //Usuário é cadastrado
        result = callAction(
                controllers.routes.ref.Cadastro.registrar(),
                fakeRequest().withFormUrlEncodedBody(ImmutableMap.of(
                        "nome", "Adolfo",
                        "login", "adolfo06",
                        "senha", "123"))
        );

        // Usuário faz login
        result = callAction(
                controllers.routes.ref.Login.logar(),
                fakeRequest().withFormUrlEncodedBody(ImmutableMap.of(
                        "login", "adolfo06",
                        "senha", "123"))
        );

        // Usuário faz logout
        result = callAction(controllers.routes.ref.Login.logout(),fakeRequest());

        assertThat(session(result).get("login")).isNull();
    }

    @Test
    public void naoDeveLogarUsuariosNaoCadastrados() {

        // Usuário faz login
        result = callAction(
                controllers.routes.ref.Login.logar(),
                fakeRequest().withFormUrlEncodedBody(ImmutableMap.of(
                        "login", "adolfo06",
                        "senha", "123"))
        );

        assertThat(session(result).get("login")).isNull();
    }

    @Before
    public void setUp() {
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
