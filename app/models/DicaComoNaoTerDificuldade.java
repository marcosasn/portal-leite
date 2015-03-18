package models;

import javax.persistence.*;

@Entity
public class DicaComoNaoTerDificuldade extends DicaSimples {
	@Column
	private String nomeAssunto;

	public DicaComoNaoTerDificuldade() {}

	public DicaComoNaoTerDificuldade(String titulo, Usuario autor, String nomeAssunto) {
		super(titulo, autor);
		setNomeAssunto(nomeAssunto);
	}

	public String getNomeAssunto() {
		return nomeAssunto;
	}

	public void setNomeAssunto(String nomeAssunto) {
		this.nomeAssunto = nomeAssunto;
	}
	
}
