package models;

import javax.persistence.*;

@Entity
public class Discordancia extends Voto {
	@Column
	private String razaoDiscordancia;

	public Discordancia() {}

	public Discordancia(Usuario autor, String razaoDiscordancia) {
		setAutor(autor);
		setRazaoDiscordancia(razaoDiscordancia);
	}

	public String getRazaoDiscordancia() {
		return razaoDiscordancia;
	}

	public void setRazaoDiscordancia(String razaoDiscordancia) {
			this.razaoDiscordancia = razaoDiscordancia;

	}

}
