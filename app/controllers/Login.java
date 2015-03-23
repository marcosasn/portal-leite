package controllers;

import models.*;
import play.data.Form;
import play.mvc.*;
import play.data.*;
import models.dao.GenericDAO;
import play.db.jpa.Transactional;
import java.util.List;
import views.html.*;

public class Login extends Controller {

    private static final GenericDAO DAO = new GenericDAO();

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

            return redirect(routes.Application.index());
        }
    }

    @Transactional
    private static boolean loginJaExistente(String loginUser) {
        List<Usuario> usuarioEncontrado = DAO.findByAttributeName("Usuario", "login", loginUser);

        return (usuarioEncontrado.size() != 0);
    }

    @Transactional
    private static boolean checaSenha(String loginUser, String senha) {
        Usuario usuarioALogar = (Usuario) DAO.findByAttributeName("Usuario", "login", loginUser).get(0);
        return usuarioALogar.checaSenha(senha);
    }

    private static boolean verificaDadosVaziosLogin(String login, String senha) {
        if(vazio(login) || vazio(senha)) {
            return true;
        }
        return false;
    }

    private static boolean vazio(String teste) {
        if(teste == null || teste == "") {
            return true;
        }
        return false;
    }
}
