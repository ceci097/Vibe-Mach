package model;
import interfaces.IMusica;

public abstract class Musica implements IMusica {

    private String titulo;
    private String artista;
    private int duracaoSegundos;

    public Musica(String titulo, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    @Override
    public abstract void exibirDetalhes();
}