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
	private static GenericDAO dao = new GenericDAO();

	@Override
	public void onStart(Application app) {
		JPA.withTransaction(new play.libs.F.Callback0() {

			@Override
			public void invoke() throws Throwable {
                Usuario user1 = new Usuario("eu", "eu", "eu");
                dao.persist(user1);

                String[] nomes = {"Análise x Design", "OO", "GRASP", "GoF", "Arquitetura", "Play", "JS", "HTML+CSS+Bootstrap",
                        "Heroku", "Labs", "Minitestes", "Projeto"};
                Disciplina si1 = new Disciplina("Sistemas da Informação I");
                dao.persist(si1);

                Tema tema;
                for (String nome: nomes) {
                    tema = new Tema(nome);
                    dao.persist(tema);
                    si1.addTema(tema);
                    dao.persist(si1);
                }
				dao.flush();
			}
		});
	}

	@Override
	public void onStop(Application app){
		JPA.withTransaction(new play.libs.F.Callback0() {
			@Override
			public void invoke() throws Throwable {
                //deveria ter algo aqui???
                //dao.remove();

			}
		});
	}
}
