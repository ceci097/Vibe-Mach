
package model;
public class MPB extends Musica {



    public MPB(String titulo, String artista, int duracaoSegundos) {
        super(titulo, artista, duracaoSegundos);

    }





    @Override
    public void exibirDetalhes() {
        System.out.println("=== Faixa MPB ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Duração: " + getDuracaoSegundos() + "s");


    }
}