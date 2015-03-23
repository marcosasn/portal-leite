package controllers;

import models.*;
import play.data.Form;
import play.mvc.*;
import play.data.*;
import models.dao.GenericDAO;
import play.db.jpa.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import views.html.*;

public class Application extends Controller {

    private static final GenericDAO DAO = new GenericDAO();

    @Transactional
    @Security.Authenticated(Secured.class)
    public static Result index() {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", request().username()).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());
        return ok(index.render(usuarioCorrente, disciplinas));
    }

    @Transactional
    @Security.Authenticated(Secured.class)
    public static Result disciplina(Long id) {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", request().username()).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());

        Disciplina disciplinaAtual = DAO.findByEntityId(Disciplina.class, id);
        List<MetaDica> listaMetaDicas = disciplinaAtual.getMetadicas();

        List<DicaSimples> listaAdicionarDicaSimples = new ArrayList<DicaSimples>();

        for(Tema temaDisciplina: disciplinaAtual.getTemas()) {
            for(IDica dicaTemaDisciplina: temaDisciplina.getDicas()) {
                if(dicaTemaDisciplina instanceof DicaSimples) {
                    listaAdicionarDicaSimples.add((DicaSimples) dicaTemaDisciplina);
                }
            }
        }

        return ok(disciplina.render(usuarioCorrente, disciplinas, disciplinaAtual, listaMetaDicas, listaAdicionarDicaSimples, ""));
    }

    @Transactional
    @Security.Authenticated(Secured.class)
    public static Result dica(long id) {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", request().username()).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());
        IDica dicaAtual = DAO.findByEntityId(IDica.class, id);

        return ok(dica.render(usuarioCorrente, disciplinas, dicaAtual, ""));
    }

    @Transactional
    @Security.Authenticated(Secured.class)
    public static Result tema(Long id) {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", request().username()).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());
        Tema temaAtual = DAO.findByEntityId(Tema.class, id);
        temaAtual.ordenarTopConcordancias();
        DAO.merge(temaAtual);

        return ok(tema.render(usuarioCorrente, disciplinas, "", temaAtual, ""));
    }

}
