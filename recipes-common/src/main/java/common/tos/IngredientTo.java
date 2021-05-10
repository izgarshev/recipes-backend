package common.tos;

import java.io.Serializable;

public class IngredientTo implements Serializable {
    private final Long id;
    private final String name;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public IngredientTo(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
