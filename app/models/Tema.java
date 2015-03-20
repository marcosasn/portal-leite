package models;

import play.db.jpa.Transactional;
import javax.persistence.*;
import models.Disciplina;
import models.IDica;

import java.util.List;

/**
 * Created by marcosasn on 17/03/15.
 */
@Entity(name="Tema")
public class Tema {
    @Id
    @GeneratedValue
    private Long idTema;

    @Column
    private String nome;

    //@OneToMany(cascade=CascadeType.ALL)
    //@JoinColumn
    //private List<IDica> dicas;

    /*@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn
    List<Avaliacao> avaliacoes;*/

    public Tema(String nome, Disciplina disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public Tema(){}

    public Long getId() {
        return idTema;
    }

    public void setId(Long id) {
        this.idTema = id;
    }

    public String getNome() {
        return nome;
    }
}