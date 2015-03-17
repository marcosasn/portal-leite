package models;

public class DicaConselho extends DicaSimples {
	private String conselho;
	
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
