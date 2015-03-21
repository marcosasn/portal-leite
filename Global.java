import models.*;
import models.DicaComoNaoTerDificuldade;
import models.DicaConselho;
import models.DicaDisciplinasAnteriores;
import models.DicaMaterialUtil;
import models.Disciplina;
import models.IDica;
import models.Tema;
import models.Usuario;
import models.dao.GenericDAO;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.db.jpa.JPA;

import java.lang.Override;
import java.util.ArrayList;
import java.util.List;

public class Global extends GlobalSettings {
	private static GenericDAO DAO = new GenericDAO();

	@Override
	public void onStart(Application app) {

		String temasSI1[] = {"Análise x Design", "OO", "GRASP", "GoF", "Arquitetura", "Play", "JS",
							 "HTML+CSS+Bootstrap", "Heroku", "Labs", "Minitestes", "Projeto"};

		JPA.withTransaction(() -> {
			Disciplina disciplinaASerCriada = criarDisciplina("Sistemas de Informação I", temasSI1);
		});
	}

	private Disciplina criarDisciplina(String nomeDisciplina, String[] temas) {
		// A disciplina a ser adicionada precisa passar por uma verificação de existência primeiro
		Disciplina disciplina = criarDisciplina(nomeDisciplina);

		for (String nomeTema : temas) {
			disciplina.addTema(criarTema(nomeTema));
		}

		DAO.merge(disciplina);
		return disciplina;
	}

	private Disciplina criarDisciplina(String nomeDisciplina) {
		Disciplina disciplina = new Disciplina(nomeDisciplina);

		// Verifica se a disciplina em questão já existe. Se existir, não precisa criar um novo, basta retorná-la.
		List<Disciplina> listaDisciplinas = DAO.findAllByClassName(Disciplina.class.getName());
		for (Disciplina disciplinaSistema: listaDisciplinas) {
			if (disciplinaSistema.equals(disciplina)) {
				return disciplinaSistema;
			}
		}

		// Se não existir, cria um novo e persiste no banco de dados
		DAO.persist(disciplina);
		return disciplina;
	}

	private Tema criarTema(String nomeTema) {
		Tema tema = new Tema(nomeTema);

		// Se o tema ja exitir, ele é retornado.
		List<Tema> listaTemas = DAO.findAllByClassName(Tema.class.getName());
		for (Tema temaSistema: listaTemas) {
			if (temaSistema.equals(tema)) {
				return temaSistema;
			}
		}

		// Se o tema não existir, ele é criado e persistido no banco de dados.
		DAO.persist(tema);
		return tema;
	}

}
