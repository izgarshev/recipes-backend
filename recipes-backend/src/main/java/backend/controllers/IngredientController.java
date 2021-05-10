package backend.controllers;

import backend.model.Ingredient;
import backend.repos.IngredientRepo;
import common.tos.IngredientTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api")
public class IngredientController {
    IngredientRepo repo;

    public IngredientController(IngredientRepo repo) {
        this.repo = repo;
    }

    @GetMapping(value = "/ingredient/all", produces = "application/json")
    public List<IngredientTo> getAll() {
        System.out.println(123);
        return ((List<Ingredient>) repo.findAll()).stream().map(Ingredient::toDto).collect(Collectors.toList());
    }
}
