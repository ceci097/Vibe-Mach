package model;

public class Sertanejo extends Musica {
    private String dupla;

    public Sertanejo(String titulo, String artista, int duracaoSegundos, String dupla){
        super(titulo, artista, duracaoSegundos);
        this.dupla=dupla;
    }

    public String getDupla(){
    return dupla;}


    @Override
    public void exibirDetalhes() {
        System.out.println("=== Faixa Sertanejo ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Duração: " + getDuracaoSegundos() + "s");
        System.out.println("Dupla/Parceria: " + this.dupla);
        System.out.println("=======================");
    }
}