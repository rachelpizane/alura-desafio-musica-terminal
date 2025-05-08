package edu.rachelpizane.api_musica_terminal;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.rachelpizane.api_musica_terminal.principal.Principal;

@SpringBootApplication
public class ApiMusicaTerminalApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiMusicaTerminalApplication.class, args);
	}
	
	@Override
	public void run(String... args){
		System.out.println("====== API DE MUSICA - TERMINAL ======");
		Principal.exibirMenu();
		System.out.println("====== [FIM] API DE MUSICA - TERMINAL ======");
	}
}
