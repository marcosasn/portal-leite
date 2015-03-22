package models;

import javax.persistence.*;

@Entity
public abstract class Voto {
	@Id
	@GeneratedValue
	private int id;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Usuario autor;

	public Voto() {}

	public Voto(Usuario autor) {
		this.autor = autor;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public int getId() {
		return id;
	}
}
