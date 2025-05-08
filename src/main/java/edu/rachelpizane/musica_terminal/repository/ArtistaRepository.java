package edu.rachelpizane.musica_terminal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.rachelpizane.musica_terminal.entity.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Long>{
    Optional<Artista> findByNomeIgnoreCase(String nome);
}
