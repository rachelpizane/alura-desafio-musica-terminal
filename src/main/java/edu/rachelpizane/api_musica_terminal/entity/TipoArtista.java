package edu.rachelpizane.api_musica_terminal.entity;

public enum TipoArtista {
    SOLO("solo"),
    DUPLA("dupla"),
    BANDA("banda");

    private String tipoArtista;

    TipoArtista(String tipoArtista) {
        this.tipoArtista = tipoArtista;
    }
}
