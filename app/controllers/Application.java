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

    @Transactional
    public static Result postarAvaliacao() {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", session("login")).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());

        DynamicForm requestData = Form.form().bindFromRequest();
        String idTema = requestData.get("idTema");
        Tema temaAtual = DAO.findByEntityId(Tema.class, Long.parseLong(idTema));

        String loginUser = requestData.get("loginUser");
        Integer dificuldade = Integer.parseInt(requestData.get("dificuldade"));

        temaAtual.addAvaliacao(loginUser,dificuldade);
        DAO.merge(temaAtual);
        return ok(tema.render(usuarioCorrente, disciplinas, "", temaAtual, "Avaliação do tema postada com sucesso."));
    }

    @Transactional
    public static Result postarDenuncia() {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", session("login")).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());

        DynamicForm requestData = Form.form().bindFromRequest();
        String idDica = requestData.get("idDica");
        IDica dicaAtual = DAO.findByEntityId(IDica.class, Long.parseLong(idDica));

        String loginUser = requestData.get("loginUser");
        dicaAtual.addDenuncia(loginUser);

        DAO.merge(dicaAtual);
        return ok(dica.render(usuarioCorrente, disciplinas, dicaAtual, ""));
    }


    @Transactional
    public static Result adicionaConcordancia() {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", session("login")).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());

        DynamicForm requestData = Form.form().bindFromRequest();

        String loginUser = requestData.get("loginUser");
        String idDica = requestData.get("idDica");

        IDica dicaAtual = DAO.findByEntityId(IDica.class, Long.parseLong(idDica));

        if (requestData.hasErrors()) {
            return ok(dica.render(usuarioCorrente, disciplinas, dicaAtual, "O formulário contém erros."));
        }

        Usuario autor = (Usuario) DAO.findByAttributeName("Usuario", "login", loginUser).get(0);

        Concordancia concordancia = new Concordancia(autor);
        try {
            dicaAtual.adicionaConcordancia(concordancia);
            DAO.merge(dicaAtual);
            DAO.persist(concordancia);
            return ok(dica.render(usuarioCorrente, disciplinas, dicaAtual, "Você concordou com esta dica."));
        } catch (Exception e) {
            return ok(dica.render(usuarioCorrente, disciplinas, dicaAtual, "Erro, usuário já votou nesta dica."));
        }

    }

    @Transactional
    public static Result adicionaDiscordancia() {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", session("login")).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());

        DynamicForm requestData = Form.form().bindFromRequest();

        String loginUser = requestData.get("loginUser");
        String idDica = requestData.get("idDica");
        String razaoDiscordancia = requestData.get("razaoDiscordancia");

        IDica dicaAtual = DAO.findByEntityId(IDica.class, Long.parseLong(idDica));

        if (requestData.hasErrors()) {
            return ok(dica.render(usuarioCorrente, disciplinas, dicaAtual, "O formulário contém erros."));
        }

        if(vazio(razaoDiscordancia)) {
            return ok(dica.render(usuarioCorrente, disciplinas, dicaAtual, "Ao discordar, informe o motivo."));
        }

        Usuario autor = (Usuario) DAO.findByAttributeName("Usuario", "login", loginUser).get(0);

        Discordancia discordancia = new Discordancia(autor, razaoDiscordancia);
        try {
            dicaAtual.adicionaDiscordancia(discordancia);
            DAO.merge(dicaAtual);
            DAO.persist(discordancia);
             return ok(dica.render(usuarioCorrente, disciplinas, dicaAtual, "Você discordou com esta dica."));
        } catch (Exception e) {
            return ok(dica.render(usuarioCorrente, disciplinas, dicaAtual, "Erro, usuário já votou nesta dica."));
        }

    }

    private static boolean vazio(String teste) {
        if(teste == null || teste == "") {
            return true;
        }
        return false;
    }
}
