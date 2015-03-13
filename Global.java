import au.com.bytecode.opencsv.CSVReader;
import models.bd.GenericDAO;
import play.*;
import play.db.jpa.JPA;


public class Global extends GlobalSettings {

	private static GenericDAO dao = new GenericDAO();

	@Override
	public void onStart(Application app) {
		Logger.info("inicializada...");

		JPA.withTransaction(new play.libs.F.Callback0() {
			
			public void invoke() throws Throwable {
			}
		});
	}
	
	public void onStop(Application app) {
		Logger.info("desligada...");
	}

}
