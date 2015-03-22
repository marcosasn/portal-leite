package models;

import javax.persistence.*;

@Entity
public class DicaMaterialUtil extends DicaSimples {
	@Column
	private String nomeURL;
	@Column
	private String dominioURL;

	public DicaMaterialUtil() {}

	public DicaMaterialUtil(String titulo, Usuario autor, String nomeURL, String dominioURL) {
		super(titulo, autor);
		this.nomeURL = nomeURL;
		this.dominioURL = dominioURL;
	}

	@Override
	public String getTipo() {
		return DicaMaterialUtil.class.getName();
	}

	@Override
	public String getCategoria() {
		return "Material útil";
	}

	public String getNomeURL() {
		return nomeURL;
	}

	public void setNomeURL(String nomeURL) {
		this.nomeURL = nomeURL;
	}

	public String getDominioURL() {
		return dominioURL;
	}

	public void setDominioURL(String dominioURL) {
		this.dominioURL = dominioURL;
	}

}
