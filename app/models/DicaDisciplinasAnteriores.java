package models;

import javax.persistence.*;

@Entity
public class DicaDisciplinasAnteriores extends DicaSimples {
	@Column
	private String nomesDisciplinas;
	@Column
	private String razoesDisciplinas;

	public DicaDisciplinasAnteriores() {}

	public DicaDisciplinasAnteriores(String titulo, Usuario autor, String nomesDisciplinas, String razoesDisciplinas) {
		super(titulo, autor);
		this.nomesDisciplinas = nomesDisciplinas;
		this.razoesDisciplinas = razoesDisciplinas;
	}

	@Override
	public String getTipo() {
		return DicaDisciplinasAnteriores.class.getName();
	}

	@Override
	public String getCategoria() {
		return "Disciplinas anteriores que te ajudarão aqui";
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
