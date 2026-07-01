import service.GerenciadorPlaylist;
import model.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        GerenciadorPlaylist gerenciador = new GerenciadorPlaylist();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        inicializarCatalogo(gerenciador);

        System.out.println("=== Bem-vindo ao VibeMatch! ===");

        do {
            try {
                System.out.println("\n1. Cadastrar Música");
                System.out.println("2. Listar todas as músicas");
                System.out.println("3. Gerar playlist");
                System.out.println("0. Sair");
                System.out.println("Escolha uma opção: ");

                switch (opcao) {
                    case 1:
                        executarCadastro(gerenciador, scanner);
                        break;
                    case 2:
                        gerenciador.listarTodas();
                        break;
                    case 3:
                        executarPlaylist(gerenciador, scanner);
                        break;
                    case 0:
                        System.out.println("Encerrando sistema");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n[ERRO] Digite apenas números inteiros!");
            }
        } while (opcao != 0);

        scanner.close();
    }


    private static void inicializarCatalogo(GerenciadorPlaylist gerenciador){
        gerenciador.adicionarMusica(new Rock ("Bohemian Rhapsody, Queen" , "Queen", 244, "Rock melancolico"));
        gerenciador.adicionarMusica(new Rock( "Back in Black, AC/DC", "AC/DC", "Rock Clássico"));
        gerenciador.adicionarMusica(new Pop("As It Was", "Hharry Styles", 255, 167));
        gerenciador.adicionarMusica(new Pop("Blinding Lights", "The Weeknd", 200, 171));
        gerenciador.adicionarMusica(new MPB("Aquarela", "Toquinho", 252, "MPB Clássica"));
    }

    public static void executarCadastro(GerenciadorPlaylist gerenciador, Scanner scanner){
        System.out.println("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.println("Artista");
        String artista = scanner.nextLine();

        System.out.println("Duração (segundos): ");
        int duracaoSegundos= scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escolha o gênero: ");
        String genero = scanner.nextLine();

        if(genero.equalsIgnoreCase("Pop")) {
            System.out.println("BPM:");
            int bpm = scanner.nextInt();
            gerenciador.adicionarMusica(new Pop(titulo, artista, duracaoSegundos, bpm ));
        } else if(genero.equalsIgnoreCase("MPB")){
            System.out.print("Movimento Cultura: ");
            String movimento= scanner.nextLine();
            gerenciador.adicionarMusica(new MPB(titulo, artista, duracaoSegundos, movimento));
        }
        System.out.println("Música adicionada!");
    }

    public static void executarPlaylist(GerenciadorPlaylist gerenciador, Scanner scanner){
        System.out.println("\n--- Gerar Playlist ---");
        System.out.print("Digite o estilo: ");
        String estilo = scanner.nextLine();
        System.out.print("Quantidade de músicas: ");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        gerenciador.gerarPlaylist(estilo, qtd);
    }
}