package backend.model;

import java.util.List;

public class Recipe extends AbstractModel{
    private final List<Ingredient> ingredients;
    private final String url;
    private final String content;

    public Recipe(Long id, List<Ingredient> ingredients, String url, String content) {
        super(id);
        this.ingredients = ingredients;
        this.url = url;
        this.content = content;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }
}
