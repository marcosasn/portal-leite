package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {

        return ok(index.render());
    }

    public static Result login() {

        return ok(login.render());
    }
    
    public static class Login {

        public String nome;
        public String login;
        public String senha;

    }
}
