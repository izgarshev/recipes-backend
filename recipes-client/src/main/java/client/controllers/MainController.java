package client.controllers;

import client.http.HttpClientService;
import client.http.HttpTest;
import common.tos.IngredientTo;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.List;

public class MainController {
    @FXML private ListView<IngredientTo> ingredients;
    HttpClientService httpClientService = new HttpClientService();

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
        HttpTest.testHttp();
    }

    public void config() {

    }

    public void initialize() {
        loadData();
        config();
    }
}
