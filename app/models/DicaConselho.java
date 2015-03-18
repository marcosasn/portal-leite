package models;

import javax.persistence.*;

@Entity
public class DicaConselho extends DicaSimples {
	@Column
	private String conselho;

	public DicaConselho() {}

	@Override
	public String getTipo() {
		return DicaConselho.class.getName();
	}

	@Override
	public String getCategoria() {
		return "Conselho";
	}

	public DicaConselho(String titulo, Usuario autor, String conselho) {
		super(titulo, autor);
		setConselho(conselho);
	}

	public String getConselho() {
		return conselho;
	}

	public void setConselho(String conselho) {
		this.conselho = conselho;
	}

}
