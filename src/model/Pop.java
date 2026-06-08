
package model;
public class Pop extends Musica {
    private int bpm;

    public Pop(String titulo, String artista, int duracaoSegundos, int bpm) {
        super(titulo, artista, duracaoSegundos);
        this.bpm = bpm;
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Faixa Pop ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Duração: " + getDuracaoSegundos() + "s");
        System.out.println("BPM: " + this.bpm);
        System.out.println("=================");
    }
}