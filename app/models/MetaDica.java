package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MetaDica extends IDica {
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	private List<IDica> listaDicas = new ArrayList<IDica>();
	@Column
	private String comentario;

	public MetaDica() {}

	@Override
	public String getTipo() {
		return MetaDica.class.getName();
	}

	@Override
	public String getCategoria() {
		return "Meta Dica";
	}

	public MetaDica(String titulo, Usuario autor, String comentario) {
		super(titulo, autor);
		setComentario(comentario);
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

}
