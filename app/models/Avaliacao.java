package models;

import javax.persistence.*;
import play.db.jpa.Transactional;
import models.Usuario;

/**
 * Created by Win7 on 3/19/2015.
 */
@Entity(name="Avaliacao")
@Transactional
public class Avaliacao {

    @Id
    @GeneratedValue
    private Long idAvaliacao;

    @Column
    private int nota;

    /*
    @OneToOne(MappedBy = "")
    private Usuario autor;
    */

    public Avaliacao() {}

    public Long getId(){
        return idAvaliacao;
    }

    public void setId(Long id) {
        idAvaliacao = id;
    }
}
