package models;

public class DicaDisciplinasAnteriores extends DicaSimples {
	private String nomesDisciplinas;
	private String razoesDisciplinas;
	
	public DicaDisciplinasAnteriores(String titulo, Usuario autor, String nomesDisciplinas, String razoesDisciplinas) {
		super(titulo, autor);
		setNomesDisciplinas(nomesDisciplinas);
		setRazoesDisciplinas(razoesDisciplinas);
	}

	public String getNomesDisciplinas() {
		return nomesDisciplinas;
	}

	public void setNomesDisciplinas(String nomesDisciplinas) {
		this.nomesDisciplinas = nomesDisciplinas;
	}

	public String getRazoesDisciplinas() {
		return razoesDisciplinas;
	}

	public void setRazoesDisciplinas(String razoesDisciplinas) {
		this.razoesDisciplinas = razoesDisciplinas;
	}

}
