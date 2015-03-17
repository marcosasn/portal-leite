package models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class IDica {
	private int id;
	private Set<Usuario> listaUsuariosQueVotaram = new HashSet<Usuario>();
	private List<Concordancia> listaConcordancia = new ArrayList<Concordancia>();
	private List<Discordancia> listaDiscordancia = new ArrayList<Discordancia>();
	private String titulo;
	private Usuario autor;
	private StatusVisualizacao statusVisualizacao;
	private StatusAberturaParaVotos statusAberturaParaVotos;
	
	public IDica(String titulo, Usuario autor) {
		setTitulo(titulo);
		setAutor(autor);
	}
	
	public static enum StatusVisualizacao { ABERTO, FECHADO }
	
	public static enum StatusAberturaParaVotos { ABERTO, FECHADO }
	
	public int getId() {
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
