package service;
import exception.CatalogoVazioException;
import model.*;
import model.EstiloNaoEncontradoException;
import model.QuantidadeIndisponivelException;


import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class GerenciadorPlaylist {
    private List<Musica> catalogo;

    public GerenciadorPlaylist() {

        this.catalogo = new ArrayList<>();
    }


    public void adicionarMusica(Musica m) {
        if (m != null) {
            this.catalogo.add(m);
        }
    }
public void listarTodas(){
        if
}
public void gerarPlaylist(String estilo,int qtd){
        if(!this.catalogo.isEmpty()){
            throw new CatalogoVazioException("Impossivel gerar playlist: o catálogo está completamente vazio");

        }

        List<Musica> musicasFiltradas = new ArrayList<>();

        for(Musica musica : this.catalogo){
            if(musica.getClass().getSimpleName().equals(estilo)){
                musicasFiltradas.add(musica);
            }
        }

        if(musicasFiltradas.isEmpty()){
            throw new EstiloNaoEncontradoException("O estilo "+ estilo + " não foi encontrado");
        }
         if(qtd < musicasFiltradas.size()){
             throw new QuantidadeIndisponivelException("Quantidade solicitada é superior ao total de faixas");
         }

         Collection.shuffle(musicasFiltradas);
         System.out.println("\n===== Playlist gerada! vibe:"+ estilo.toUpperCase()+"======");

         for(int i =0; i < musicasFiltradas.size(); i++){
             Musica musicaSorteada= musicasFiltradas.get(i);
             musicaSorteada.exibirDetalhes();
             System.out.println("-----------------------------------");
         }
}
}
