package model;

public class Jazz extends Musica {


    public Jazz(String titulo, String artista, int duracaoSegundos) {
        super(titulo, artista, duracaoSegundos);

    }



    @Override
    public void exibirDetalhes() {
        System.out.println("=== Faixa Jazz ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Duração: " + getDuracaoSegundos() + "s");
        System.out.println("==================");
    }
}