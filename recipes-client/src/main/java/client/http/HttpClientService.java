//package client.http;
//
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.SerializableEntity;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.impl.io.EmptyInputStream;
//
//import java.io.InputStream;
//import java.io.ObjectInputStream;
//import java.io.Serializable;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.CompletionException;
//
//public class HttpClientService {
//    public CompletableFuture<Object> sendRequest(String url, Serializable object) {
//        return CompletableFuture.supplyAsync(() -> {
//            HttpClient client = HttpClientBuilder.create().build();
//            try {
//                if (object != null) {
//                    return postRequest(client, new HttpPost(url), object);
//                } else {
//                    return getRequest(client, new HttpGet(url));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//                throw new CompletionException("не удалось получить данные от сервера", e);
//            }
//        });
//    }
//
//    private Object converter(final InputStream is) {
//        if(is instanceof EmptyInputStream) return null;
//        try (ObjectInputStream objectInputStream = new ObjectInputStream(is)) {
//            return objectInputStream.readObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    private Object postRequest(final HttpClient client, final HttpPost httpPost, final Serializable object) throws Exception {
//        SerializableEntity serializableEntity = new SerializableEntity(object, false);
//        httpPost.setEntity(serializableEntity);
//        return converter(client.execute(httpPost).getEntity().getContent());
//    }
//
//    private Object getRequest(final HttpClient client, final HttpGet httpGet) throws Exception {
//        return converter(client.execute(httpGet).getEntity().getContent());
//    }
//
//}
