package model;
public class Eletronica extends Musica {


    public Eletronica(String titulo, String artista, int duracaoSegundos) {
        super(titulo, artista, duracaoSegundos);

    }



    @Override
    public void exibirDetalhes() {
        System.out.println("=== Faixa Eletrônica ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Duração: " + getDuracaoSegundos() + "s");

        System.out.println("========================");
    }
}

    // tudo tem que estar certo  antes de por o javadoc

    //-encoding UTF-8 -docencoding UTF-8 -charset UTF-8 comando pra gerar o javadoc
// ir em tools para gerar o javadoc