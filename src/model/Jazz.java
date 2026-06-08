package model;

public class Jazz extends Musica {
    private String instrumentoSolo;

    public Jazz(String titulo, String artista, int duracaoSegundos, String instrumentoSolo) {
        super(titulo, artista, duracaoSegundos);
        this.instrumentoSolo = instrumentoSolo;
    }

    public String getInstrumentoSolo() {
        return instrumentoSolo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Faixa Jazz ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Duração: " + getDuracaoSegundos() + "s");
        System.out.println("Instrumento Solo: " + this.instrumentoSolo);
        System.out.println("==================");
    }
}