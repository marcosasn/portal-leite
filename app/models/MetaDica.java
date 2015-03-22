package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MetaDica extends IDica {
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn
	private List<IDica> listaDicas = new ArrayList<IDica>();
	@Column
	private String comentario;

	public MetaDica() {}

	public MetaDica(String titulo, Usuario autor, String comentario) {
		super(titulo, autor);
		this.comentario = comentario;
	}

	@Override
	public String getTipo() {
		return MetaDica.class.getName();
	}

	@Override
	public String getCategoria() {
		return "Meta Dica";
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public void adicionaDica(IDica dica) {
		listaDicas.add(dica);
	}

	public List<IDica> getListaDicas() {
		return listaDicas;
	}

	public int getNumeroDicasNaMetaDica() {
		return listaDicas.size();
	}

}
