package edu.rachelpizane.musica_terminal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.rachelpizane.musica_terminal.entity.Musica;

public interface MusicaRepository extends JpaRepository<Musica, Long>{
    List<Musica> findAllByArtistaNomeContainingIgnoreCase(String nome);
}
