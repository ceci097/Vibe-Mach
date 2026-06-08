package model;

public class Rock extends Musica{
    private String subgenero;


public Rock(String titulo, String artista, int duracaoSegundos, String subgenero){
    super(titulo, artista, duracaoSegundos);
    this.subgenero=subgenero;
}

public String subgenero(){
    return subgenero;
}

@Override

public void exibirDetalhes(){
    System.out.println("Faixa Rock");
    System.out.println("Título: " + this.getTitulo());
    System.out.println("Artista" + this.getArtista());
    System.out.println("Duração" + this.getDuracaoSegundos() + "s");
    System.out.println("Subgênero" + this.subgenero);
    

}








}