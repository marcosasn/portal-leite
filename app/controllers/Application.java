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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

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
    public static Result postarMetaDica() {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", session("login")).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());

        DynamicForm requestData = Form.form().bindFromRequest();

        String loginUser = requestData.get("loginUser");
        String titulo = requestData.get("titulo");
        String idDisciplina = requestData.get("idDisciplina");
        String comentario = requestData.get("comentario");

        Map<String, String[]> map = request().body().asFormUrlEncoded();
        String[] dicasSimplesSelecionadas = map.get("selectDicaSimples");
        String[] metaDicasSelecionadas = map.get("selectMetaDica");

        Disciplina disciplinaAtual = DAO.findByEntityId(Disciplina.class, Long.parseLong(idDisciplina));
        List<MetaDica> listaMetaDicas = disciplinaAtual.getMetadicas();

        List<DicaSimples> listaAdicionarDicaSimples = new ArrayList<DicaSimples>();

        for(Tema temaDisciplina: disciplinaAtual.getTemas()) {
            for(IDica dicaTemaDisciplina: temaDisciplina.getDicas()) {
                if(dicaTemaDisciplina instanceof DicaSimples) {
                    listaAdicionarDicaSimples.add((DicaSimples) dicaTemaDisciplina);
                }
            }
        }

        if (requestData.hasErrors()) {
            return ok(disciplina.render(usuarioCorrente, disciplinas, disciplinaAtual, listaMetaDicas, listaAdicionarDicaSimples, ""));
        }
        if(vazio(titulo)) {
            return ok(disciplina.render(usuarioCorrente, disciplinas, disciplinaAtual, listaMetaDicas, listaAdicionarDicaSimples, "Digite um título para sua meta-dica"));
        }

        if(arrayVazio(dicasSimplesSelecionadas) && arrayVazio(metaDicasSelecionadas)) {
            return ok(disciplina.render(usuarioCorrente, disciplinas, disciplinaAtual, listaMetaDicas, listaAdicionarDicaSimples, "Escolha pelo menos uma dica ou meta-dica para formar sua meta-dica."));
        }

        if(vazio(comentario)) {
            return ok(disciplina.render(usuarioCorrente, disciplinas, disciplinaAtual, listaMetaDicas, listaAdicionarDicaSimples, "Faça um comentário sobre sua meta-dica."));
        }

        Usuario autor = (Usuario) DAO.findByAttributeName("Usuario", "login", loginUser).get(0);

            MetaDica novaMetaDica = new MetaDica(titulo, autor, comentario);

        if(!arrayVazio(dicasSimplesSelecionadas)) {
            // Adiciona dicas simples à meta-dica
            for (String idDicaSelecionada : dicasSimplesSelecionadas) {
                DicaSimples dicaAdicionada = DAO.findByEntityId(DicaSimples.class, Long.parseLong(idDicaSelecionada));
                novaMetaDica.adicionaDica(dicaAdicionada);
            }
        }
        if(!arrayVazio(metaDicasSelecionadas)) {
            // Adiciona meta-dicas à meta-dica
            for (String idDicaSelecionada : metaDicasSelecionadas) {
                MetaDica dicaAdicionada = DAO.findByEntityId(MetaDica.class, Long.parseLong(idDicaSelecionada));
                novaMetaDica.adicionaDica(dicaAdicionada);
            }
        }

            DAO.persist(novaMetaDica);
            disciplinaAtual.getMetadicas().add(novaMetaDica);
            DAO.merge(disciplinaAtual);

            return ok(disciplina.render(usuarioCorrente, disciplinas, disciplinaAtual, listaMetaDicas, listaAdicionarDicaSimples, "Meta-dica para esta disciplina criada com sucesso."));

    }

    private static boolean arrayVazio(String[] array) {
        if(array == null || array.length == 0) {
            return true;
        }

        return false;
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
        List<IDica> listaDicas = DAO.findAllByClassName("IDica");
        Tema temaAtual = DAO.findByEntityId(Tema.class, id);

        return ok(tema.render(usuarioCorrente, disciplinas, "", listaDicas, temaAtual));
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

        String idTema = requestData.get("idTema");

        Tema temaAtual = DAO.findByEntityId(Tema.class, Long.parseLong(idTema));

        if (requestData.hasErrors()) {
            return ok(tema.render(usuarioCorrente, disciplinas, "O formulário contém erros.", listaDicas, temaAtual));
        }
        if(vazio(titulo)) {
            return ok(tema.render(usuarioCorrente, disciplinas, "Digite um título para sua dica.", listaDicas, temaAtual));
        }
        if (!algumCampoCategoriaPreenchido(assuntos, conselho, disciplinasanteriores, razoes, endereco)) {
            return ok(tema.render(usuarioCorrente, disciplinas, "Escolha uma categoria e preencha o que se pede.", listaDicas, temaAtual));
        }

        if(!vazio(disciplinasanteriores) || !vazio(razoes)) {
            if(vazio(disciplinasanteriores) || vazio(razoes)) {
                return ok(tema.render(usuarioCorrente, disciplinas, "Ao escolher essa categoria, preencha tudo que se pede.", listaDicas, temaAtual));
            }
        }

        Usuario autor = (Usuario) DAO.findByAttributeName("Usuario", "login", loginUser).get(0);

        if(!vazio(assuntos)) {
            DicaComoNaoTerDificuldade dicaComoNaoTerDificuldadeForm = new DicaComoNaoTerDificuldade(titulo, autor, assuntos);
            DAO.persist(dicaComoNaoTerDificuldadeForm);
            temaAtual.getDicas().add(dicaComoNaoTerDificuldadeForm);
            DAO.merge(temaAtual);

            return ok(tema.render(usuarioCorrente, disciplinas, "Dica da categoria 'Não ter dificuldade' criada com sucesso", listaDicas, temaAtual));
        }

        if(!vazio(conselho)) {
            DicaConselho dicaConselhoForm = new DicaConselho(titulo, autor, conselho);
            DAO.persist(dicaConselhoForm);
            temaAtual.getDicas().add(dicaConselhoForm);
            DAO.merge(temaAtual);

            return ok(tema.render(usuarioCorrente, disciplinas, "Dica da categoria 'Conselho' criada com sucesso", listaDicas, temaAtual));
        }

        if(!vazio(disciplinasanteriores) && !vazio(razoes)) {
            DicaDisciplinasAnteriores dicaDisciplinasAnterioresForm = new DicaDisciplinasAnteriores(titulo, autor, disciplinasanteriores, razoes);
            DAO.persist(dicaDisciplinasAnterioresForm);
            temaAtual.getDicas().add(dicaDisciplinasAnterioresForm);
            DAO.merge(temaAtual);

            return ok(tema.render(usuarioCorrente, disciplinas, "Dica da categoria 'Disciplinas Anteriores' criada com sucesso", listaDicas, temaAtual));
        }

        if(!vazio(endereco)) {
            DicaMaterialUtil dicaMaterialUtilForm = new DicaMaterialUtil(titulo, autor, endereco, dominio);
            DAO.persist(dicaMaterialUtilForm);
            temaAtual.getDicas().add(dicaMaterialUtilForm);
            DAO.merge(temaAtual);

            return ok(tema.render(usuarioCorrente, disciplinas, "Dica da categoria 'Material útil' criada com sucesso", listaDicas, temaAtual));
        }

        return ok(tema.render(usuarioCorrente, disciplinas, "Erro: processamento do formulario chegou ao fim e não houve resultados.", listaDicas, temaAtual));
    }

    @Transactional
    public static Result postarAvaliacao() {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", session("login")).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());
        List<IDica> listaDicas = DAO.findAllByClassName("IDica");

        DynamicForm requestData = Form.form().bindFromRequest();
        String idTema = requestData.get("idTema");
        Tema temaAtual = DAO.findByEntityId(Tema.class, Long.parseLong(idTema));

        String loginUser = requestData.get("loginUser");
        Integer dificuldade = Integer.parseInt(requestData.get("dificuldade"));

        temaAtual.addAvaliacao(loginUser,dificuldade);
        DAO.merge(temaAtual);
        return ok(estatisticas.render(usuarioCorrente, disciplinas, "Avaliação do tema postada com sucesso.", listaDicas, temaAtual));
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
