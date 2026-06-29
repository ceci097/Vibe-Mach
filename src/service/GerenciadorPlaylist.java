package service;
import exception.CatalogoVazio;
import model.Musica;
import modelEstiloNaoEncontradoException;
import model.QuantidadeIndispoNivelException;
import model.CatalogoVazio;

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

public void gerarPlaylist(String estilo,int qtd){
        if(!this.catalogo.isEmpty()){
            throw new CatalogoVazioException("Impossivel gerar playlist: o catálogo está completamente vazio");

        }

        List<Musica> musicasFiltradas = new ArrayList<>();
}
}
