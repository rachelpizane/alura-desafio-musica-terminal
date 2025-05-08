package edu.rachelpizane.api_musica_terminal.entity;

public enum TipoArtista {
    SOLO("solo"),
    DUPLA("dupla"),
    BANDA("banda");

    private String tipoArtista;

    TipoArtista(String tipoArtista) {
        this.tipoArtista = tipoArtista;
    }

    public static TipoArtista converterStringParaEnum(String tipoArtista) {
        for (TipoArtista tipoArtistaEnum : TipoArtista.values()) {
            if (tipoArtistaEnum.tipoArtista.equalsIgnoreCase(tipoArtista)) { 
                return tipoArtistaEnum ;
            }
        }

        throw new IllegalArgumentException("Categoria não encontrada: " + tipoArtista);
    }
}
