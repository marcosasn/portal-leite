package models;

public class DicaMaterialUtil extends DicaSimples {
	private String nomeURL;
	private String dominioURL;
	
	public DicaMaterialUtil(String titulo, Usuario autor, String nomeURL, String dominioURL) {
		super(titulo, autor);
		setNomeURL(nomeURL);
		setDominioURL(dominioURL);
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