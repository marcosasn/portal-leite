package models;

import javax.persistence.*;

@Entity
public class Concordancia extends Voto {

	public Concordancia() {}

	public Concordancia(Usuario autor) {
		setAutor(autor);
	}
	
}
