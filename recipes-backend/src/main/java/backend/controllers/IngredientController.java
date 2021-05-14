package backend.controllers;

import backend.model.Ingredient;
import backend.repos.IngredientRepo;
import common.tos.IngredientTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/api")
public class IngredientController {
    IngredientRepo repo;

    public IngredientController(IngredientRepo repo) {
        this.repo = repo;
    }

    @GetMapping(value = "/ingredient/all", produces = "application/json")
    public List<IngredientTo> getAll() {
        System.out.println(123);
        return Arrays.asList(new IngredientTo(1L, "1"), new IngredientTo(2L, "2"));
//        return ((List<Ingredient>) repo.findAll()).stream().map(Ingredient::toDto).collect(Collectors.toList());
    }
}
