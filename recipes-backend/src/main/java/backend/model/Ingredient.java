package backend.model;


import common.tos.IngredientTo;

import javax.persistence.Table;

@Table
public class Ingredient extends AbstractModel {
    private final String name;

    public Ingredient(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static IngredientTo toDto(Ingredient ingredient) {
        if (ingredient == null || ingredient.getId() == null || ingredient.getName() == null) throw new IllegalArgumentException("ingredient is null");
        return new IngredientTo(ingredient.getId(), ingredient.getName());
    }
}
