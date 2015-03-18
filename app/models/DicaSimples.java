package models;

import javax.persistence.Entity;

@Entity
public abstract class DicaSimples extends IDica {

	public DicaSimples() {}
	public DicaSimples(String titulo, Usuario autor) {
		super(titulo, autor);
	}
	
}
