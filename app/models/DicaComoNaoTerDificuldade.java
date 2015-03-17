package models;

public class DicaComoNaoTerDificuldade extends DicaSimples {
	private String nomeAssunto;
	
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
