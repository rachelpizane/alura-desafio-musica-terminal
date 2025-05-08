package edu.rachelpizane.api_musica_terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.rachelpizane.api_musica_terminal.entity.Artista;
import edu.rachelpizane.api_musica_terminal.entity.Musica;
import edu.rachelpizane.api_musica_terminal.entity.TipoArtista;
import edu.rachelpizane.api_musica_terminal.principal.Principal;
import edu.rachelpizane.api_musica_terminal.repository.ArtistaRepository;
import edu.rachelpizane.api_musica_terminal.repository.MusicaRepository;

@SpringBootApplication
public class ApiMusicaTerminalApplication implements CommandLineRunner {
	@Autowired
	private ArtistaRepository artistaRepository;
	
	@Autowired
	private MusicaRepository musicaRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApiMusicaTerminalApplication.class, args);
	}
	
	@Override
	public void run(String... args){
		Principal principal = new Principal(artistaRepository, musicaRepository);
		System.out.println("====== API DE MUSICA - TERMINAL ======");
		principal.exibirMenu();
		System.out.println("====== [FIM] API DE MUSICA - TERMINAL ======");
	}
}
