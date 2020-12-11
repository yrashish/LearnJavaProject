package learn.completablefuture;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

public class ExampleCompletableAll {
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest httpRequest1 = HttpRequest
                .newBuilder()
                .GET()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .build();
        HttpRequest httpRequest2 = HttpRequest
                .newBuilder()
                .GET()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .build();
        HttpResponse<String> httpResponse1 = httpClient.send(httpRequest1, HttpResponse.BodyHandlers.ofString());
        HttpResponse<String> httpResponse2 = httpClient.send(httpRequest2, HttpResponse.BodyHandlers.ofString());

        CompletableFuture completableFuture1 = CompletableFuture.supplyAsync(()->httpResponse1.body());
        CompletableFuture completableFuture2 = CompletableFuture.supplyAsync(()->httpResponse2.body());
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFuture1, completableFuture2);
        Stream.of(completableFuture1, completableFuture2)
                .map(CompletableFuture::join)
                .forEach(s-> System.out.println(s));

    }

}
