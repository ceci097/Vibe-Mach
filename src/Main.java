    import service.GerenciadorPlaylist;
    import model.*;
    import java.util.InputMismatchException;
    import java.util.Scanner;



    public class Main {
        public static void main(String args[]) {
            GerenciadorPlaylist gerenciasor = new GerenciadorPlaylist();

            Scanner scanner = new Scanner(System.in);
            int opção = -1;

            InicializadorCatalogo(gerenciador);
            KO

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
                            executadorCadastro(gerenciasor, scanner);
                            break;
                        case 2:
                            gerenciasor.ListarTodas();
                            break;
                        case 3:
                            executarCriacaoPlaylist(gerenciasor, scanner);
                            break;
                        case 0:
                            System.out.println("Encerrando sistema");
                    }
                }
            } catch(InputMismatchException e){
                System.out.println("\n[ERRO] Digite apenas números inteiros!");
            }
            while (opção != 0) ;

            scanner.close();


            private static void inicializarDadosCatalogo(GerenciadorPlaylist gerenciasor){
                gerenciasor.adicionarMusica(new(Rock "Bohemian Rhapsody, Queen" , 355, "Rock Progressivo"));
                gerenciasor.adicionarMusica(new(Rock "Back in Black, AC/DC", 255, "Rock Clássico"));
                gerenciasor.adicionarMusica(new Pop("As It Was", "Hharry Styles", 255, 167));
                gerenciasor.adicionarMusica(new Pop("Blinding Lights", "The Weeknd", 200, 171));
                gerenciasor.adicionarMusica(new MPB("Aquarela", "Toquinho", 252, "MPB Clássica"));

            }

            public static void executarCadastro(GerenciadorPlaylist gerenciador, Scanner scanner){
                System.out.println("Titulo: ");
                String titulo = scanner.nextLine();

                System.out.println("Artista");
                String artista = scanner.nextLine();

                System.out.println("Duração (segundos): ");
                scanner.nextLine();

                System.out.println("Escolha o gênero: ");
                String genero = scanner.nextLine();


                if(genero.equalsIgnoreCase("Pop")) {
                    System.out.println("BPM:");
                    int bpm = scanner.nextInt();
                    gerenciasor.adicionarMusica(new Pop(titulo, artista, duracaoSegundos, bpm ));


                }else if(genero.equalsIgnoreCase("MPB")){
                    System.out.print("MOvimento Cultura: ");
                    String movimento= scanner.nextLine();
                    gerenciasor.adicionarMusica(new MPB(titulo, artista, duracaoSegundos, movimento));
                }
            }
        }
    }




