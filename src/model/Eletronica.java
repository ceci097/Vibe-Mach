package model;
public class Eletronica extends Musica {
    private String tipoSintetizador;

    public Eletronica(String titulo, String artista, int duracaoSegundos, String tipoSintetizador) {
        super(titulo, artista, duracaoSegundos);
        this.tipoSintetizador = tipoSintetizador;
    }

    public String getTipoSintetizador() {
        return tipoSintetizador;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Faixa Eletrônica ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Duração: " + getDuracaoSegundos() + "s");
        System.out.println("Sintetizador Base: " + this.tipoSintetizador);
        System.out.println("========================");
    }

    // tudo tem que estar certo  antes de por o javadoc
,
    //-encoding UTF-8 -docencoding UTF-8 -charset UTF-8 comando pra gerar o javadoc
// ir em tools para gerar o javadoc