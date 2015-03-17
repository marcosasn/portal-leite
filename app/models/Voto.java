package models;

public abstract class Voto {
	private Usuario autor;

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
}
