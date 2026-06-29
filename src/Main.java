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


            private static void inicializarDadosCatalogo(GerenciadorPlaylist gerenciador){

            }
        }
    }




