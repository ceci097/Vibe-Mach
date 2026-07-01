package model;

public class Sertanejo extends Musica {

    public Sertanejo(String titulo, String artista, int duracaoSegundos){
        super(titulo, artista, duracaoSegundos);

    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Faixa Sertanejo ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Duração: " + getDuracaoSegundos() + "s");
        System.out.println("=======================");
    }
}