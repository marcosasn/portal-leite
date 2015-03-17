package models;

public class Discordancia extends Voto {
	private String razaoDiscordancia;
	
	public Discordancia(Usuario autor, String razaoDiscordancia) throws Exception {
		setAutor(autor);
		setRazaoDiscordancia(razaoDiscordancia);
	}

	public String getRazaoDiscordancia() {
		return razaoDiscordancia;
	}

	public void setRazaoDiscordancia(String razaoDiscordancia) throws Exception {
		if (razaoDiscordancia.length() > 100) {
			throw new Exception();
		} else {
			this.razaoDiscordancia = razaoDiscordancia;
		}
	}

}
