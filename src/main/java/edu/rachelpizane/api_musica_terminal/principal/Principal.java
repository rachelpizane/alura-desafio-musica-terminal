package edu.rachelpizane.api_musica_terminal.principal;

import java.util.Scanner;

import edu.rachelpizane.api_musica_terminal.repository.ArtistaRepository;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private ArtistaRepository repository;

    public Principal(ArtistaRepository repository) {
        this.repository = repository;
    }

    public void exibirMenu() {
        String opcao = "";

        while (!opcao.equals("x")) {
            scanner = new Scanner(System.in);
            String menu = """
                    - MENU ----
                    1 - Cadastar artistas
                    2 - Cadastrar música
                    3 - Listar todas as músicas
                    4 - Listar músicas por artista
                    5 - Buscar informações sobre o artista

                    x - Sair da Aplicação
                    """;
            String inputMensagem = "Digite a opção desejada: ";

            System.out.println(menu);
            System.out.print(inputMensagem);
            opcao = scanner.nextLine();
            // opcao = "x";
            System.out.println("\n");

            switch (opcao) {
                case "x":
                    System.out.println(">> Obrigada por usar a API!");
                    break;
                case "1":
                    cadastrarArtista();
                    break;
                case "2":
                    cadastrarMusica();
                    break;
                case "3":
                    listarTodasMusicas();
                    break;
                case "4":
                    listarMusicasPorArtista();
                    break;
                case "5":
                    pesquisarDadosSobreArtista();
                    break;
                default:
                    System.out.println(">> Opção inválida.Tente novamente.");
                    break;
            }
        }
    }

    private static void listarTodasMusicas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodasMusicas'");
    }

    private static void pesquisarDadosSobreArtista() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesquisarDadosSobreArtista'");
    }

    private static void listarMusicasPorArtista() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarMusicasPorArtista'");
    }

    private static void cadastrarMusica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarMusica'");
    }

    private static void cadastrarArtista() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarArtista'");
    }
}
