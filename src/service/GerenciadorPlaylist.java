package service;
import model.Musica;
import modelEstiloNaoEncontradoException;
import model.QuantidadeIndispoNivelException;
import model.CatalogoVazio;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class GerenciadorPlaylist {
    private List<Musica> catalogo;

    public GerenciadorPlaylist(){
        this.catalogo = new ArrayList<>();

    }

    public void adicionarMusica(Musica m){
        if(m != null){
            this,catalogo.add(m);
        }
    }

    public void ListarTodas(){
        if(this.catalogo.isEmpty()){

        }
    }

}
