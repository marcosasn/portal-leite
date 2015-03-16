package controllers;

import models.Usuario;
import play.*;
import play.data.Form;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import models.dao.GenericDAO;
import play.db.jpa.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import views.html.*;

public class Application extends Controller {

    private static final GenericDAO DAO = new GenericDAO();

    @Transactional
    @Security.Authenticated(Secured.class)
    public static Result index() {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", request().username()).get(0);

        return ok(index.render(usuarioCorrente));
    }

    public static Result login() {
        return ok(
                login.render("Seja bem-vindo ao Portal do Leite")
        );
    }

    public static Result logout() {
        session().clear();
        return redirect(routes.Application.index());
    }

    @Transactional
    public static Result logar() {
        DynamicForm requestData = Form.form().bindFromRequest();

        String loginUser = requestData.get("login");
        String senha = requestData.get("senha");

        if (requestData.hasErrors()) {
            return ok(login.render("O formulário contém erros."));
        }
        if (verificaDadosVaziosLogin(loginUser, senha)) {
            return ok(login.render("Nenhum dado pode estar vazio."));
        }
        if (!loginJaExistente(loginUser)) {
            return ok(login.render("Usuário não cadastrado."));
        }
        if (!checaSenha(loginUser, senha)) {
            return ok(login.render("Senha incorreta. Tente novamente."));
        } else {
            Usuario user = (Usuario) DAO.findByAttributeName("Usuario", "login", loginUser).get(0);
            session().clear();
            session("login", user.getLogin());

            List<Usuario> usuarioCorrente = DAO.findByAttributeName("Usuario", "login", session("login"));

            return ok(index.render(usuarioCorrente.get(0)));
        }
    }

    @Transactional
    public static Result registrar() {
        DynamicForm requestData = Form.form().bindFromRequest();

        String nome = requestData.get("nome");
        String loginUser = requestData.get("login");
        String senha = requestData.get("senha");

        if (requestData.hasErrors()) {
            return ok(login.render("O formulário contém erros."));
        }
        if (verificaDadosVaziosCadastro(nome, loginUser, senha)) {
            return ok(login.render("Nenhum dado pode estar vazio."));
        }
        if (loginJaExistente(loginUser)) {
            return ok(login.render("Usuário já existente. Por favor, utilizar um login diferente."));
        }

            Usuario novoUsuario = new Usuario(nome, loginUser, senha);
            DAO.persist(novoUsuario);

            return ok(login.render("Usuário cadastrado com sucesso!"));

    }

    @Transactional
    private static boolean loginJaExistente(String loginUser) {
        List<Usuario> usuarioEncontrado = DAO.findByAttributeName("Usuario", "login", loginUser);

        return (usuarioEncontrado.size() != 0);
    }

    @Transactional
    private static boolean checaSenha(String loginUser, String senha) {
        List<Usuario> usuarioALogar = DAO.findByAttributeName("Usuario", "login", loginUser);
        return usuarioALogar.get(0).checaSenha(senha);
    }

    private static boolean verificaDadosVaziosLogin(String login, String senha) {
        if(login == null || senha == null || login == "" || senha == "") {
            return true;
        }

        return false;
    }

    private static boolean verificaDadosVaziosCadastro(String nome, String login, String senha) {
        if(nome == null || login == null || senha == null || nome == "" || login == "" || senha == "") {
            return true;
        }

        return false;
    }
}
