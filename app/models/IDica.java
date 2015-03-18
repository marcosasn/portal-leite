package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public abstract class IDica {
	@Id
	@GeneratedValue
	private long id;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	private Set<Usuario> listaUsuariosQueVotaram = new HashSet<Usuario>();

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	private List<Concordancia> listaConcordancia = new ArrayList<Concordancia>();

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	private List<Discordancia> listaDiscordancia = new ArrayList<Discordancia>();

	@Column
	private String titulo;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Usuario autor;

	@Column
	private StatusVisualizacao statusVisualizacao;
	@Column
	private StatusAberturaParaVotos statusAberturaParaVotos;

	public IDica() {}

	public IDica(String titulo, Usuario autor) {
		setTitulo(titulo);
		setAutor(autor);
	}
	
	public static enum StatusVisualizacao { ABERTO, FECHADO }
	
	public static enum StatusAberturaParaVotos { ABERTO, FECHADO }
	
	public long getId() {
		return id;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	
	public StatusVisualizacao getStatusVisualizacao() {
		return statusVisualizacao;
	}

	public StatusAberturaParaVotos getStatusAberturaParaVotos() {
		return statusAberturaParaVotos;
	}

	public List<Concordancia> getListaConcordancia() {
		return listaConcordancia;
	}
	
	public List<Discordancia> getListaDiscordancia() {
		return listaDiscordancia;
	}
	
	public Set<Usuario> getListaUsuariosQueVotaram() {
		return listaUsuariosQueVotaram;
	}

	public void adicionaConcordancia(Concordancia concordancia) throws Exception {
		if (getListaUsuariosQueVotaram().contains(concordancia.getAutor())) {
			throw new Exception();
		}
		else {
			getListaConcordancia().add(concordancia);
			getListaUsuariosQueVotaram().add(concordancia.getAutor());
		}
	}

	public void adicionaDiscordancia(Discordancia discordancia) throws Exception {
		if (getListaUsuariosQueVotaram().contains(discordancia.getAutor())) {
			throw new Exception();
		}
		else {
			getListaDiscordancia().add(discordancia);
			getListaUsuariosQueVotaram().add(discordancia.getAutor());
		}
	}
	
    public int getNumeroVotos() {
    	return getListaConcordancia().size() + getListaDiscordancia().size();
    }
    
    public int getNumeroConcordancias() {
    	return listaConcordancia.size();
    }
    
    public int getNumeroDiscordancia() {
    	return listaDiscordancia.size();
    }
    
    public float calculaIndiceConcordancia() {
    	return getNumeroConcordancias() / getNumeroVotos();
    }
 
}
