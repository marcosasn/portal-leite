package models;

import javax.persistence.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

@Entity
public abstract class IDica implements Comparable<IDica> {
	@Id
	@GeneratedValue
	private long id;

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
	private StatusVisualizacao statusVisualizacao = StatusVisualizacao.ABERTO;
	@Column
	private StatusAberturaParaVotos statusAberturaParaVotos = StatusAberturaParaVotos.ABERTO;

    @ElementCollection
    @MapKeyColumn
    @Column
    @CollectionTable
    private Map<String, Integer> denuncias = new HashMap<String, Integer>();

    public IDica() {}

	public IDica(String titulo, Usuario autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public static enum StatusVisualizacao { ABERTO, FECHADO }
	
	public static enum StatusAberturaParaVotos { ABERTO, FECHADO }
	
	public long getId() {
		return id;
	}

	public void setId(long id) { this.id = id; }
	
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
	
	public boolean isVisivel() {
		return statusVisualizacao == StatusVisualizacao.ABERTO;
	}

	public boolean isVotavel() {
		return statusAberturaParaVotos == StatusAberturaParaVotos.ABERTO;
	}

	public abstract String getTipo();

	public abstract String getCategoria();

	public List<Concordancia> getListaConcordancia() {
		return  listaConcordancia;
	}
	
	public List<Discordancia> getListaDiscordancia() {
		List<Discordancia> listaInvertida = new ArrayList<Discordancia>();
		for(Discordancia disc: listaDiscordancia) {
			listaInvertida.add(disc);
		}
		Collections.reverse(listaInvertida);
		return listaInvertida;
	}

	public void adicionaConcordancia(Concordancia concordancia) throws Exception {
		if (getListaUsuariosQueVotaram().contains(concordancia.getAutor())) {
			throw new Exception("Usuário já votou");
		}
		else {
			listaConcordancia.add(concordancia);
            this.verificaEstadoVotacao();
		}
	}

	public void adicionaDiscordancia(Discordancia discordancia) throws Exception {

		if (getListaUsuariosQueVotaram().contains(discordancia.getAutor())) {
			throw new Exception("Usuário já votou");
		}
		else {
			listaDiscordancia.add(discordancia);
            this.verificaEstadoVotacao();
		}
	}

	public Set<Usuario> getListaUsuariosQueVotaram() {
		Set<Usuario> listaUsuariosQueVotaram = new HashSet<Usuario>();

		for(Concordancia conc: getListaConcordancia()) {
			listaUsuariosQueVotaram.add(conc.getAutor());
		}
		for(Discordancia dconc: getListaDiscordancia()) {
			listaUsuariosQueVotaram.add(dconc.getAutor());
		}
		return listaUsuariosQueVotaram;
	}

	public boolean usuarioAtualVotouNestaDica(Usuario usuario) {
		if((getListaUsuariosQueVotaram().contains(usuario))) {
			return true;
		}
		return false;
	}
	
    public int getNumeroVotos() {
    	return getNumeroConcordancias() + getNumeroDiscordancia();
    }
    
    public int getNumeroConcordancias() {
    	return listaConcordancia.size();
    }
    
    public int getNumeroDiscordancia() {
    	return listaDiscordancia.size();
    }
    
    public String calculaIndiceConcordancia() {
		DecimalFormat df = new DecimalFormat("###.###");
		df.setRoundingMode(RoundingMode.UP);
		double resultado = ((double) getNumeroConcordancias() / (double) getNumeroVotos());

		if (getNumeroVotos() > 0) {
			return df.format(resultado);
		} else {
			return "0,0";
		}
    }

    public boolean recebeuDenunciaDe(String user) {
        if(denuncias.containsKey(user)){
            return true;
        }
        return false;
    }

    public void addDenuncia(String user){
        denuncias.put(user,new Integer(1));
        this.verificaVisualizacao();
    }

    private void verificaVisualizacao() {
        int cont = 0;
        for(Integer value: denuncias.values()) {
            cont += value;
            if (cont == 3){
                statusVisualizacao = StatusVisualizacao.FECHADO;
            }
        }
    }

    private void verificaEstadoVotacao(){
        if (this.getNumeroConcordancias() == 20 || this.getNumeroDiscordancia() == 20) {
            statusAberturaParaVotos = StatusAberturaParaVotos.FECHADO;
        }
    }

    @Override
    public int compareTo(IDica iDica) {
        return iDica.getNumeroConcordancias() - this.getNumeroConcordancias();
    }
}
