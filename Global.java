import play.*;
import models.dao.GenericDAO;
import play.GlobalSettings;
import play.db.jpa.JPA;
import models.SI1;
import models.Tema;

public class Global extends GlobalSettings {

	private static GenericDAO dao = new GenericDAO();

	@Override
	public void onStart(Application app) {
		Logger.info("Aplicação inicializada...");

		JPA.withTransaction(new play.libs.F.Callback0() {
			@Override
			public void invoke() throws Throwable {
				String []temas = {"Análise x Design", "OO", "GRASP", "GoF", "Arquitetura", "Play", "JS",
						"HTML+CSS+Bootstrap", "Heroku", "Labs", "Minitestes", "Projeto"};

				SI1 si1 = new SI1();
				for(String tema: temas) {
					si1.addTema(new Tema(tema));
				}
				dao.persist(si1);
			}});
	}
}
