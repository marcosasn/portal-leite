package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcosasn on 17/03/15.
 */
@Entity(name="Disciplina")
public class Disciplina {
    @Id
    @GeneratedValue
    private Long idDisciplina;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn
    private List<Tema> temas = new ArrayList<Tema>();

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn
    private List<MetaDica> metadicas = new ArrayList<MetaDica>();

    @Column
    private String nome;

    public Disciplina(String nome){
        this.nome = nome;
    }

    public Disciplina(){}

    public Long getId() {
        return idDisciplina;
    }

    public void setId(Long id) {
        this.idDisciplina = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tema addTema(Tema tema) {
        if (tema != null && !temas.contains(tema)) {
            temas.add(tema);
            return tema;
        }
        return null;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public List<MetaDica> getMetadicas() {
        return metadicas;
    }

    public  void addMetaDica(MetaDica metaDica) {
        metadicas.add(metaDica);
    }

    public int getNumeroMetaDicas() {
        return metadicas.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Disciplina)) {
            return false;
        }

        Disciplina subject = (Disciplina) o;

        if (!nome.equals(subject.nome)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}
