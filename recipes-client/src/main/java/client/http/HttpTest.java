package client.http;

import common.tos.IngredientTo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpTest {

    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:8080/api/ingredient/all")).build();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void testHttp() {
        System.out.println("test http");
//        try {
//            HttpRequest build = HttpRequest.newBuilder()
//                    .uri(new URI("http://localhost:8080/ingredient/all")).GET().build();
//            HttpResponse<String> send = HttpClient.newBuilder().build().send(build, HttpResponse.BodyHandlers.ofString());
//            System.out.println(send.body());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
