package models;

import play.db.jpa.Transactional;
import javax.persistence.*;
import models.Disciplina;
import models.IDica;
import models.Avaliacao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn
    private List<IDica> dicas;

    @ElementCollection
    @MapKeyColumn
    @Column
    @CollectionTable
    private Map<String, Integer> avaliacoes = new HashMap<String, Integer>();

    public Tema(String nome) {
        this.nome = nome;
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

    public List<IDica> getDicas() {
        return dicas;
    }

    public int getNumeroDicas() {
        return dicas.size();
    }

    public void addAvaliacao(String login, Integer avaliacao) {
        avaliacoes.put(login, avaliacao);
    }

    public int getNumeroAvaliacoes(){
        return avaliacoes.size();
    }
}