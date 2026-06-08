package model;

public class Rap extends Musica {
    private int rimasPorMinuto;


    public Rap(String titulo, String artista, int duracaoSegundos, int rimasPorMinuto) {
        super(titulo, artista, duracaoSegundos);
        this.rimasPorMinuto = rimasPorMinuto;
    }

    public int getRimasPorMinuto() {
        return rimasPorMinuto;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Faixa Rap ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Duração: " + getDuracaoSegundos() + "s");
        System.out.println("Rimas por Minuto: " + this.rimasPorMinuto);
        System.out.println("=================");
    }
}