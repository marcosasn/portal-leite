import models.*;
import models.DicaComoNaoTerDificuldade;
import models.DicaConselho;
import models.DicaDisciplinasAnteriores;
import models.DicaMaterialUtil;
import models.IDica;
import models.Usuario;
import models.dao.GenericDAO;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.db.jpa.JPA;

import java.lang.Override;
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

				/*
				Usuario user2 = new Usuario("debugar", "debugar", "debugar");
				dao.persist(user2);
				*/

				DicaComoNaoTerDificuldade dica1 = new DicaComoNaoTerDificuldade("Esse é o titulo", user1, "Não tenha dificuldades :)");
				dao.persist(dica1);

				DicaConselho dica2 = new DicaConselho("Título de conselho", user1, "Consselhos são bons!");
				dao.persist(dica2);

				DicaDisciplinasAnteriores dica3 = new DicaDisciplinasAnteriores("Meu titulo", user1, "Si1, BD1", "Essas são disciplinas anteriores interessantes");
				dao.persist(dica3);

				DicaMaterialUtil dica4 = new DicaMaterialUtil("Site legal", user1, "heroku", ".com");
				dao.persist(dica4);

				dao.flush();
			}
		});
	}

	/*
	@Override
	public void onStop(Application app){
		JPA.withTransaction(new play.libs.F.Callback0() {
			@Override
			public void invoke() throws Throwable {
				List<IDica> dicas = dao.findAllByClassName(IDica.class.getName());

				for (IDica idica : dicas) {
					dao.removeById(IDica.class, idica.getId());
				}
			}
		});
	}
	*/
}
