
package model;
public class MPB extends Musica {
    private String movimento;


    public MPB(String titulo, String artista, int duracaoSegundos, String movimento) {
        super(titulo, artista, duracaoSegundos);
        this.movimento = movimento;
    }


    public String getMovimento() {
        return movimento;
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("=== Faixa MPB ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Duração: " + getDuracaoSegundos() + "s");
        System.out.println("Movimento Cultural: " + this.movimento);

    }
}