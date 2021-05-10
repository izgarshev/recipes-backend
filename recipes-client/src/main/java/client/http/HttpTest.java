package client.http;

import common.tos.IngredientTo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpTest {
    public static void testHttp() {
        try {
            HttpRequest build = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/ingredient/all")).GET().build();
            HttpResponse<String> send = HttpClient.newBuilder().build().send(build, HttpResponse.BodyHandlers.ofString());
            System.out.println(send.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
