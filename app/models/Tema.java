package models;

import play.db.jpa.Transactional;
import javax.persistence.*;
import models.Disciplina;
import models.IDica;
import models.Avaliacao;

import java.util.*;

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

    public double getMedia() {
        int soma = 0;
        for(Integer integer: avaliacoes.values()) {
            soma += integer;
        }
        return soma/this.getNumeroAvaliacoes();
    }

    public double getMediana() {
        Integer[] valores = new Integer[this.getNumeroAvaliacoes()];
        valores = avaliacoes.values().toArray(valores);
        Arrays.sort(valores);
        int index = this.getNumeroAvaliacoes();

        if(this.getNumeroAvaliacoes() > 1 && this.getNumeroAvaliacoes()%2 == 0){
            return (valores[(index/2)-1] + valores[(index/2)+1])/2;
        }
        else if (this.getNumeroAvaliacoes()> 1 && this.getNumeroAvaliacoes()%2 != 0){
            return valores[(index/2)-1];
        }
        return valores[index-1];
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tema)) {
            return false;
        }

        Tema topic = (Tema) o;

        if (!nome.equals(topic.nome)) {
            return false;
        }

        return true;
    }
}