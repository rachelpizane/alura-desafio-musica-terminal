package edu.rachelpizane.musica_terminal.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConversorDados {
    private static ObjectMapper mapper = new ObjectMapper();

    public static <T> T conversor(String json, Class<T> classe){
        try {
            return mapper.readValue(json, classe);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);

        }
    }
}
