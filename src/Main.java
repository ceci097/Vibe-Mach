import model.*;
import service.GerenciadorPlaylist;
import exception.CatalogoVazioException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GerenciadorPlaylist gerenciador = new GerenciadorPlaylist();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;


        //inicializarCatalogo(gerenciador);

        System.out.println("=== Bem-vindo ao VibeMatch! ===");

        do {
            try {
                System.out.println("\n1. Cadastrar Música");
                System.out.println("2. Listar todas as músicas");
                System.out.println("3. Gerar playlist");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();
                scanner.nextLine();

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
                        System.out.println("Encerrando o sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente de 0 a 3.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n[ERRO] Digite apenas números inteiros para o menu!");
                scanner.nextLine();
            } catch (RuntimeException e) {

                System.out.println("\n[AVISO DO SISTEMA] " + e.getMessage());
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void inicializarCatalogo(GerenciadorPlaylist gerenciador) {

        gerenciador.adicionarMusica(new Pop("As It Was", "Harry Styles", 167));
        gerenciador.adicionarMusica(new Pop("Flowers", "Miley Cyrus", 200));
        gerenciador.adicionarMusica(new Rock("Bohemian Rhapsody", "Queen", 355));
        gerenciador.adicionarMusica(new Rock("Numb", "Linkin Park", 185));
        gerenciador.adicionarMusica(new MPB("AnotaPlaca", "MD Chefe", 150));
    }

    public static void executarCadastro(GerenciadorPlaylist gerenciador, Scanner scanner) {
        System.out.println("\n--- Cadastro de Nova Música ---");

        System.out.println("Gêneros disponíveis: Pop, MPB, Rock, Sertanejo, Eletronica");
        String genero="";
        System.out.print("Escolha o gênero da música: ");
        String genero = scanner.nextLine().trim();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Duração (segundos): ");
        int duracaoSegundos = scanner.nextInt();
        scanner.nextLine();


        if (genero.equalsIgnoreCase("Pop")) {
            gerenciador.adicionarMusica(new Pop(titulo, artista, duracaoSegundos));
        } else if (genero.equalsIgnoreCase("MPB")) {
            gerenciador.adicionarMusica(new MPB(titulo, artista, duracaoSegundos));
        } else if (genero.equalsIgnoreCase("Rock")) {
            gerenciador.adicionarMusica(new Rock(titulo, artista, duracaoSegundos));
        } else if (genero.equalsIgnoreCase("Sertanejo")) {
            gerenciador.adicionarMusica(new Sertanejo(titulo, artista, duracaoSegundos));
        } else if (genero.equalsIgnoreCase("Eletronica")) {
            gerenciador.adicionarMusica(new Eletronica(titulo, artista, duracaoSegundos));
        } else {
            System.out.println("\n[AVISO] Estilo '" + genero + "' inválido. Música não cadastrada.");
            return;
        }

        System.out.println("Música adicionada com sucesso!");
    }

    public static void executarPlaylist(GerenciadorPlaylist gerenciador, Scanner scanner) {
        System.out.println("\n--- Gerar Playlist ---");

        System.out.print("Digite o estilo: ");
        String estilo = scanner.nextLine();

        System.out.print("Quantidade de músicas: ");
        int qtd = scanner.nextInt();
        scanner.nextLine();


        gerenciador.gerarPlaylist(estilo, qtd);
    }
}