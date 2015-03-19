package models;

import javax.persistence.*;
import play.db.jpa.Transactional;
import models.Usuario;

/**
 * Created by Win7 on 3/19/2015.
 */
/*@Entity(name="Avaliacao")
@Transactional*/
public class Avaliacao {

    @Id
    @GeneratedValue
    private Long idAvaliacao;

    @Column
    private int nota;

    @OneToOne
    @JoinColumn
    private Usuario autor;

    public Avaliacao(Usuario autor, int nota) {
        this.autor = autor;
        this.nota = nota;
    }

    public Avaliacao() {}

    public Long getId(){
        return idAvaliacao;
    }

    public void setId(Long id) {
        idAvaliacao = id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
}
