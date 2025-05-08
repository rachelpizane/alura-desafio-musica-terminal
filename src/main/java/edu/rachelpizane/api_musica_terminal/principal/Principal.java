package edu.rachelpizane.api_musica_terminal.principal;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import edu.rachelpizane.api_musica_terminal.entity.Artista;
import edu.rachelpizane.api_musica_terminal.entity.Musica;
import edu.rachelpizane.api_musica_terminal.repository.ArtistaRepository;
import edu.rachelpizane.api_musica_terminal.repository.MusicaRepository;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private ArtistaRepository artistaRepository;
    private MusicaRepository musicaRepository;

    public Principal(ArtistaRepository artistaRepository, MusicaRepository musicaRepository) {
        this.artistaRepository = artistaRepository;
        this.musicaRepository = musicaRepository;
    }

    public void exibirMenu() {
        String opcao = "";

        while (!opcao.equals("x")) {
            scanner = new Scanner(System.in);
            String menu = """
                    \n- MENU ----
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

    private void listarTodasMusicas() {
        System.out.println("- LISTA DE TODAS AS MUSICAS -----");
        List<Musica> musicasEncontradas = musicaRepository.findAll();

        if(musicasEncontradas.isEmpty()){
            System.out.println("Nenhuma música cadastrada");
        }

        musicasEncontradas.forEach(musica -> {
            System.out.printf("Nome: %s - Artista: %s%n", musica.getNome(), musica.getArtista().getNome());
        });
    }

    private void pesquisarDadosSobreArtista() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesquisarDadosSobreArtista'");
    }

    private void listarMusicasPorArtista() {
        System.out.println("- LISTA DE TODAS AS MUSICAS POR ARTISTA -----");
        System.out.print("Digite o nome do artista: ");
        String nomeArtista = scanner.nextLine();

        List<Musica> musicasEncontradas = musicaRepository.findAllByArtistaNomeContainingIgnoreCase(nomeArtista);

        if(musicasEncontradas.isEmpty()){
            System.out.println("Nenhuma música encontra para este artista");
        }

        System.out.println("\nMúsicas do(a) artista " + musicasEncontradas.get(0).getArtista().getNome());

        musicasEncontradas.forEach(musica -> {
            System.out.printf("  Nome: %s %n", musica.getNome());
        });
    }

    private void cadastrarMusica() {
        System.out.println("- CADASTRAR MUSICA -----");
        System.out.print("Digite o nome do artista: ");
        String nomeArtista = scanner.nextLine();

        Optional<Artista> artistaBuscado = artistaRepository.findByNomeIgnoreCase(nomeArtista);

        if(artistaBuscado.isEmpty()){
            System.out.println("Artista não identificado para o cadastro da música");
            return;
        }

        Artista artistaEncontrado = artistaBuscado.get();

        System.out.print("Digite o nome da música: ");
        String nomeMusica= scanner.nextLine();

        Musica novaMusica = new Musica(nomeMusica);

        artistaEncontrado.adicionarMusica(novaMusica);

        artistaRepository.save(artistaEncontrado);
        System.out.println(">> Música salva com sucesso!");
    }

    private void cadastrarArtista() {
        System.out.println("- CADASTRAR ARTISTA -----");
        System.out.print("Digite o nome do artista: ");
        String nomeArtista = scanner.nextLine();
        
        System.out.print("Digite tipo de artista (Solo/Dupla/Banda): ");
        String tipoArtista = scanner.nextLine();

        Artista novoArtista = new Artista(nomeArtista, tipoArtista);

        artistaRepository.save(novoArtista);
        System.out.println(">> Cadastro salvo com sucesso!");
    }
}
