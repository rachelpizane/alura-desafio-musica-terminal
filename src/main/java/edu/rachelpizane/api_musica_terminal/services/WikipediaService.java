package edu.rachelpizane.api_musica_terminal.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WikipediaService {
    public static String teste(String nomeArtista) {
        String apiUrlPadrao = "https://pt.wikipedia.org/api/rest_v1/page/summary/";
        String pesquisaFormata = nomeArtista.replace(" ", "_");

        String apiUrlFinal = apiUrlPadrao + pesquisaFormata;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrlFinal)).build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (IOException e) {
            throw new RuntimeException(e);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        return response.body();
    }

}
