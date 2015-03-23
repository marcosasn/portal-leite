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

public class IDicaController extends Controller {

    private static final GenericDAO DAO = new GenericDAO();

    @Transactional
    public static Result postarDica() {
        Usuario usuarioCorrente = (Usuario) DAO.findByAttributeName("Usuario", "login", session("login")).get(0);
        List<Disciplina> disciplinas = DAO.findAllByClassName(Disciplina.class.getName());

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
            return ok(tema.render(usuarioCorrente, disciplinas, "O formulário contém erros.", temaAtual, ""));
        }
        if(vazio(titulo)) {
            return ok(tema.render(usuarioCorrente, disciplinas, "Digite um título para sua dica.", temaAtual, ""));
        }
        if (!algumCampoCategoriaPreenchido(assuntos, conselho, disciplinasanteriores, razoes, endereco)) {
            return ok(tema.render(usuarioCorrente, disciplinas, "Escolha uma categoria e preencha o que se pede.", temaAtual, ""));
        }

        if(!vazio(disciplinasanteriores) || !vazio(razoes)) {
            if(vazio(disciplinasanteriores) || vazio(razoes)) {
                return ok(tema.render(usuarioCorrente, disciplinas, "Ao escolher essa categoria, preencha tudo que se pede.", temaAtual, ""));
            }
        }

        Usuario autor = (Usuario) DAO.findByAttributeName("Usuario", "login", loginUser).get(0);

        if(!vazio(assuntos)) {
            DicaComoNaoTerDificuldade dicaComoNaoTerDificuldadeForm = new DicaComoNaoTerDificuldade(titulo, autor, assuntos);
            DAO.persist(dicaComoNaoTerDificuldadeForm);
            temaAtual.addDica(dicaComoNaoTerDificuldadeForm);
            DAO.merge(temaAtual);

            return ok(tema.render(usuarioCorrente, disciplinas, "Dica da categoria 'Não ter dificuldade' criada com sucesso", temaAtual, ""));
        }

        if(!vazio(conselho)) {
            DicaConselho dicaConselhoForm = new DicaConselho(titulo, autor, conselho);
            DAO.persist(dicaConselhoForm);
            temaAtual.addDica(dicaConselhoForm);
            DAO.merge(temaAtual);

            return ok(tema.render(usuarioCorrente, disciplinas, "Dica da categoria 'Conselho' criada com sucesso", temaAtual, ""));
        }

        if(!vazio(disciplinasanteriores) && !vazio(razoes)) {
            DicaDisciplinasAnteriores dicaDisciplinasAnterioresForm = new DicaDisciplinasAnteriores(titulo, autor, disciplinasanteriores, razoes);
            DAO.persist(dicaDisciplinasAnterioresForm);
            temaAtual.addDica(dicaDisciplinasAnterioresForm);
            DAO.merge(temaAtual);

            return ok(tema.render(usuarioCorrente, disciplinas, "Dica da categoria 'Disciplinas Anteriores' criada com sucesso", temaAtual, ""));
        }

        if(!vazio(endereco)) {
            DicaMaterialUtil dicaMaterialUtilForm = new DicaMaterialUtil(titulo, autor, endereco, dominio);
            DAO.persist(dicaMaterialUtilForm);
            temaAtual.addDica(dicaMaterialUtilForm);
            DAO.merge(temaAtual);

            return ok(tema.render(usuarioCorrente, disciplinas, "Dica da categoria 'Material útil' criada com sucesso", temaAtual, ""));
        }

        return ok(tema.render(usuarioCorrente, disciplinas, "Erro: processamento do formulario chegou ao fim e não houve resultados.", temaAtual, ""));
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
        disciplinaAtual.addMetaDica(novaMetaDica);
        DAO.merge(disciplinaAtual);

        return ok(disciplina.render(usuarioCorrente, disciplinas, disciplinaAtual, listaMetaDicas, listaAdicionarDicaSimples, "Meta-dica para esta disciplina criada com sucesso."));

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

    private static boolean arrayVazio(String[] array) {
        if(array == null || array.length == 0) {
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
