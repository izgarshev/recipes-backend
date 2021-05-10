package backend.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractModel {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private final Long id;

    public AbstractModel(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
