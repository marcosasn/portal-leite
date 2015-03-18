package models;

import play.db.jpa.Transactional;
import javax.persistence.*;
import models.Tema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcosasn on 17/03/15.
 */
@Entity(name="Disciplina")
@Transactional
public abstract class Disciplina {
    @Id
    @GeneratedValue
    private Long idDisciplina;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn
    List<Tema> temas = new ArrayList<Tema>();

    public Disciplina(){}

    public Long getId() {
        return idDisciplina;
    }

    public void setId(Long id) {
        this.idDisciplina = id;
    }

    public Tema addTema(Tema tema) {
        if (tema != null && !temas.contains(tema)) {
            temas.add(tema);
            return tema;
        }
        return null;
    }
}
