package app.models.util;

import play.db.jpa.Transactional;
import javax.persistence.*;

/**
 * Created by marcosasn on 17/03/15.
 */
@Entity(name = "Disciplina")
@Transactional
public abstract class Disciplina {
    @Id
    @GeneratedValue
    private Long id;

    public Disciplina(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
