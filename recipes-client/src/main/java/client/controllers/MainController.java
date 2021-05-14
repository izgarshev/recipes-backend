package client.controllers;

//import client.http.HttpClientService;
import client.http.HttpTest;
import common.tos.IngredientTo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.Arrays;
import java.util.List;

public class MainController {
    @FXML private ListView<IngredientTo> ingredients;
    private ObservableList<IngredientTo> toObservableList = FXCollections.observableArrayList();
//    HttpClientService httpClientService = new HttpClientService();

    public void loadData() {
//        httpClientService.<List<IngredientTo>>sendRequest("http://localhost:8080/ingredient/all", null)
//                .thenAccept(o -> {
//                    System.out.println("пробуем получить ингредиенты");
//                    System.out.println(o);
//                })
//                .exceptionally(throwable -> {
//                    throwable.printStackTrace();
//                    return null;
//                });
        toObservableList.addAll(Arrays.asList(new IngredientTo(1L, "1"), new IngredientTo(2L, "2")));
        HttpTest.testHttp();
    }

    public void config() {
        ingredients.setItems(toObservableList);
    }

    public void initialize() {
        loadData();
        config();
    }
}
