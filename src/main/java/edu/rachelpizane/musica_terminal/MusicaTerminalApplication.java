package edu.rachelpizane.musica_terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.rachelpizane.musica_terminal.principal.Principal;
import edu.rachelpizane.musica_terminal.repository.ArtistaRepository;
import edu.rachelpizane.musica_terminal.repository.MusicaRepository;

@SpringBootApplication
public class MusicaTerminalApplication implements CommandLineRunner {
	@Autowired
	private ArtistaRepository artistaRepository;
	
	@Autowired
	private MusicaRepository musicaRepository;
	public static void main(String[] args) {
		SpringApplication.run(MusicaTerminalApplication.class, args);
	}
	
	@Override
	public void run(String... args){
		Principal principal = new Principal(artistaRepository, musicaRepository);
		System.out.println("====== MUSICA - TERMINAL ======");
		principal.exibirMenu();
		System.out.println("====== [FIM] MUSICA - TERMINAL ======");
	}
}
