package controllers;

import models.*;
import play.data.Form;
import play.mvc.*;
import play.data.*;
import models.dao.GenericDAO;
import play.db.jpa.Transactional;
import java.util.List;
import views.html.*;

public class VotoController extends Controller {

    private static final GenericDAO DAO = new GenericDAO();

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
