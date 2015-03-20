package controllers;

import models.*;
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
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());
        return ok(index.render(usuarioCorrente, disciplinas));
    }

    @Transactional
    @Security.Authenticated(Secured.class)
    public static Result disciplina(Long id) {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", request().username()).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());

        Disciplina disciplinaAtual = (Disciplina) DAO.findByEntityId(Disciplina.class, id);

        return ok(disciplina.render(usuarioCorrente, disciplinas, disciplinaAtual));
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
    public static Result tema() {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", request().username()).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());
        List<IDica> listaDicas = DAO.findAllByClassName("IDica");

        return ok(tema.render(usuarioCorrente, disciplinas, "", listaDicas));
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

            Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", session("login")).get(0);

            return redirect(routes.Application.index());
        }
    }

    @Transactional
    public static Result postarDica() {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", session("login")).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());
        List<IDica> listaDicas = DAO.findAllByClassName("IDica");

        DynamicForm requestData = Form.form().bindFromRequest();

        String loginUser = requestData.get("loginUser");
        String titulo = requestData.get("titulo");

        String assuntos = requestData.get("assuntos");

        String conselho = requestData.get("conselho");

        String disciplinasanteriores = requestData.get("disciplinasanteriores");
        String razoes = requestData.get("razoes");

        String endereco = requestData.get("endereco");
        String dominio = requestData.get("dominio");


        if (requestData.hasErrors()) {
            return ok(tema.render(usuarioCorrente, disciplinas, "O formulário contém erros.", listaDicas));
        }
        if(vazio(titulo)) {
            return ok(tema.render(usuarioCorrente, disciplinas, "Digite um título para sua dica.", listaDicas));
        }
        if (!algumCampoCategoriaPreenchido(assuntos, conselho, disciplinasanteriores, razoes, endereco)) {
            return ok(tema.render(usuarioCorrente, disciplinas, "Escolha uma categoria e preencha o que se pede.", listaDicas));
        }

        if(!vazio(disciplinasanteriores) || !vazio(razoes)) {
            if(vazio(disciplinasanteriores) || vazio(razoes)) {
                return ok(tema.render(usuarioCorrente, disciplinas, "Ao escolher essa categoria, preencha tudo que se pede.", listaDicas));
            }
        }

        Usuario autor = (Usuario) DAO.findByAttributeName("Usuario", "login", loginUser).get(0);

        if(!vazio(assuntos)) {
            DicaComoNaoTerDificuldade dicaComoNaoTerDificuldadeForm = new DicaComoNaoTerDificuldade(titulo, autor, assuntos);
            DAO.persist(dicaComoNaoTerDificuldadeForm);

            return ok(tema.render(usuarioCorrente, disciplinas, "Dica da categoria 'Não ter dificuldade' criada com sucesso", listaDicas));
        }

        if(!vazio(conselho)) {
            DicaConselho dicaConselhoForm = new DicaConselho(titulo, autor, conselho);
            DAO.persist(dicaConselhoForm);

            return ok(tema.render(usuarioCorrente, disciplinas, "Dica da categoria 'Conselho' criada com sucesso", listaDicas));
        }

        if(!vazio(disciplinasanteriores) && !vazio(razoes)) {
            DicaDisciplinasAnteriores dicaDisciplinasAnterioresForm = new DicaDisciplinasAnteriores(titulo, autor, disciplinasanteriores, razoes);
            DAO.persist(dicaDisciplinasAnterioresForm);

            return ok(tema.render(usuarioCorrente, disciplinas, "Dica da categoria 'Disciplinas Anteriores' criada com sucesso", listaDicas));
        }

        if(!vazio(endereco)) {
            DicaMaterialUtil dicaMaterialUtilForm = new DicaMaterialUtil(titulo, autor, endereco, dominio);
            DAO.persist(dicaMaterialUtilForm);

            return ok(tema.render(usuarioCorrente, disciplinas, "Dica da categoria 'Material útil' criada com sucesso", listaDicas));
        }

        return ok(tema.render(usuarioCorrente, disciplinas, "Erro: processamento do formulario chegou ao fim e não houve resultados.", listaDicas));

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
        Usuario usuarioALogar = (Usuario) DAO.findByAttributeName("Usuario", "login", loginUser).get(0);
        return usuarioALogar.checaSenha(senha);
    }

    private static boolean verificaDadosVaziosLogin(String login, String senha) {
        if(vazio(login) || vazio(senha)) {
            return true;
        }
        return false;
    }

    private static boolean verificaDadosVaziosCadastro(String nome, String login, String senha) {
        if(vazio(nome) || vazio(login) || vazio(senha)) {
            return true;
        }
        return false;
    }

    private static boolean algumCampoCategoriaPreenchido(String assuntos, String conselho, String disciplinasanteriores, String razoes, String endereco) {
        if(!vazio(assuntos) || !vazio(conselho) || !vazio(disciplinasanteriores) || !vazio(razoes) || !vazio(endereco)) {
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
