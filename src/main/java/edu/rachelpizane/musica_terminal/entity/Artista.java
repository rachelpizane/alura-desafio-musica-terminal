package edu.rachelpizane.musica_terminal.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "artistas")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoArtista tipoArtista;
    
    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Musica> musicas = new ArrayList<>();

    public Artista() { }

    public Artista(String nome, String tipoArtista) {
        this.nome = nome;
        this.tipoArtista = TipoArtista.converterStringParaEnum(tipoArtista);
    }

    public Artista(String nome, TipoArtista tipoArtista) {
        this.nome = nome;
        this.tipoArtista = tipoArtista;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoArtista getTipoArtista() {
        return tipoArtista;
    }

    public void setTipoArtista(TipoArtista tipoArtista) {
        this.tipoArtista = tipoArtista;
    }

    

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void adicionarMusica(Musica musica) {
        musica.setArtista(this);

        this.musicas.add(musica);
    }

    @Override
    public String toString() {
        return "Artista [id=" + id + ", nome=" + nome + ", tipoArtista=" + tipoArtista + "]";
    }
}
