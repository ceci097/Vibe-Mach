package model;

public class Rock extends Musica{


public Rock(String titulo, String artista, int duracaoSegundos){
    super(titulo, artista, duracaoSegundos);

}


@Override

public void exibirDetalhes(){
    System.out.println("Faixa Rock");
    System.out.println("Título: " + this.getTitulo());
    System.out.println("Artista" + this.getArtista());
    System.out.println("Duração" + this.getDuracaoSegundos() + "s");

    

}








}