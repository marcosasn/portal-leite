package controllers;

import models.Usuario;
import play.*;
import play.data.Form;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {

        return ok(index.render());
    }

    public static Result login() {
        return ok(
                login.render(Form.form(Login.class))
        );
    }

    public static Result authenticate() {
        Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session().clear();
            session("nome", loginForm.get().nome);
            return redirect(
                    routes.Application.index()
            );
        }
    }

    public static class Login {

        public String nome;
        public String login;
        public String senha;

        public String validate() {
            if (Usuario.authenticate(nome, login, senha) == null) {
                return "Algum dado está inválido";
            }
            return null;
        }

    }
}
