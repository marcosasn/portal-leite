package models;

import javax.persistence.*;

@Entity
public class DicaComoNaoTerDificuldade extends DicaSimples {
	@Column
	private String nomeAssunto;

	public DicaComoNaoTerDificuldade() {}

	public DicaComoNaoTerDificuldade(String titulo, Usuario autor, String nomeAssunto) {
		super(titulo, autor);
		this.nomeAssunto = nomeAssunto;
	}

	@Override
	public String getTipo() {
		return DicaComoNaoTerDificuldade.class.getName();
	}

	@Override
	public String getCategoria() {
		return "O que você precisa saber para não ter dificuldades";
	}

	public String getNomeAssunto() {
		return nomeAssunto;
	}

	public void setNomeAssunto(String nomeAssunto) {
		this.nomeAssunto = nomeAssunto;
	}
	
}
