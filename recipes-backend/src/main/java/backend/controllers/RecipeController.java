package backend.controllers;

import backend.model.Recipe;
import backend.repos.RecipeRepo;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class RecipeController {
    RecipeRepo recipeRepo;

    public RecipeController(RecipeRepo recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    @RequestMapping(value = "http://localhost:8080/recipes/all")
    public List<Recipe> getAll() {
        return (List<Recipe>) recipeRepo.findAll();
    }
}
