import models.dao.GenericDAO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import play.db.jpa.JPA;
import play.db.jpa.JPAPlugin;
import play.mvc.Http;
import play.mvc.Result;
import play.GlobalSettings;
import play.test.FakeApplication;
import play.test.Helpers;
import scala.Option;
import javax.persistence.EntityManager;
import models.Usuario;

import java.util.List;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;


public class ApplicationTest {

    public final GenericDAO dao = new GenericDAO();
    private Result result;

    @Test
    public void deveCadastrarUsuario() throws Exception {
        List<Usuario> usuarios = dao.findAllByClassName(Usuario.class.getName());
        assertThat(usuarios.size()).isEqualTo(0);

        Usuario novousuario1 = new Usuario("Adolfo", "adolfo06", "123");

        // Adiciono um novo usuario e verifico que o número de usuários é 1
        dao.persist(novousuario1);
        usuarios = dao.findAllByClassName(Usuario.class.getName());
        assertThat(usuarios.size()).isEqualTo(1);

        Usuario novousuario2 = new Usuario("Marcos", "marcossasn", "1234");

        // Adiciono um usuario difirente e verifico que o número de usuários e 2
        dao.persist(novousuario2);
        usuarios = dao.findAllByClassName(Usuario.class.getName());
        assertThat(usuarios.size()).isEqualTo(2);

        // Tento adicionar o mesmo usuário anterior e verifico que o numero de usuarios é o mesmo (2)
        dao.persist(novousuario2);
        usuarios = dao.findAllByClassName(Usuario.class.getName());
        assertThat(usuarios.size()).isEqualTo(2);

        // Tento adicionar o mesmo usuário anterior e verifico que o numero de usuarios é o mesmo (2)
        dao.persist(novousuario2);
        usuarios = dao.findAllByClassName(Usuario.class.getName());
        assertThat(usuarios.size()).isEqualTo(2);

        Usuario novousuario3 = new Usuario("Seila", "seila", "1234");

        // Adiciono um usuario difirente e verifico que o número de usuários e 3
        dao.persist(novousuario3);
        usuarios = dao.findAllByClassName(Usuario.class.getName());
        assertThat(usuarios.size()).isEqualTo(3);
    }

    public EntityManager em;

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
