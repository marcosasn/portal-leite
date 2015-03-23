package controllers;

import models.*;
import play.data.Form;
import play.mvc.*;
import play.data.*;
import models.dao.GenericDAO;
import play.db.jpa.Transactional;
import java.util.List;
import views.html.*;

public class TemaController extends Controller {

    private static final GenericDAO DAO = new GenericDAO();

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

}
