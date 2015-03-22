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

public class Cadastro extends Controller {

    private static final GenericDAO DAO = new GenericDAO();

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

    private static boolean verificaDadosVaziosCadastro(String nome, String login, String senha) {
        if(vazio(nome) || vazio(login) || vazio(senha)) {
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
