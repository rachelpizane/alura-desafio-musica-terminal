package edu.rachelpizane.musica_terminal.records;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DescricaoArtista(@JsonAlias(value = "extract") String descricaoArtista) {
}
