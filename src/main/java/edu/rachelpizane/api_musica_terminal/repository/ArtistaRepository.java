package edu.rachelpizane.api_musica_terminal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.rachelpizane.api_musica_terminal.entity.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Long>{
    Optional<Artista> findByNomeIgnoreCase(String nome);
}
