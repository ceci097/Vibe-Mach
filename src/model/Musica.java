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

    public void setArtista(String artista) {
        if(this.artista==null|| artista.trim().isEmpty()){
            throw new IllegalArgumentException("O artista não pode ser vazio");
        }
        this.artista=artista;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {

        if(duracaoSegundos<=0){
            throw new IllegalArgumentException("A duração deve ser maior que zero");
        }
        this.duracaoSegundos=duracaoSegundos;
    }

    public void setTitulo(String titulo) {
       if(this.titulo == null || titulo.trim().isEmpty()){
           throw new IllegalArgumentException("O título não pode ser vazio");
       }
       this.titulo=titulo;
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