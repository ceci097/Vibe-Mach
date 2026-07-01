package service;

import model.Musica;
import model.EstiloNaoEncontradoException;
import model.QuantidadeIndisponivelException;
import exception.CatalogoVazioException;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

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


    public void listarTodas() {

        if (this.catalogo.isEmpty()) {
            throw new CatalogoVazioException("Não há nenhuma música cadastrada no catálogo geral.");
        }

        for (Musica musica : this.catalogo) {
            musica.exibirDetalhes();
            System.out.println("-----------------------------------");
        }
    }


    public void gerarPlaylist(String estilo, int qtd) {

        if (this.catalogo==null||catalogo.isEmpty()) {
            throw new CatalogoVazioException("Impossível gerar playlist: o catálogo está completamente vazio.");
        }


        List<Musica> musicasFiltradas = new ArrayList<>();


        for (Musica musica : this.catalogo) {

            if (musica.getClass().getSimpleName().equalsIgnoreCase(estilo)) {
                musicasFiltradas.add(musica);
            }
        }


        if (musicasFiltradas.isEmpty()) {
            throw new EstiloNaoEncontradoException("O estilo '" + estilo + "' não foi encontrado ou não possui músicas cadastradas.");
        }

        if (qtd > musicasFiltradas.size()) {
            throw new QuantidadeIndisponivelException("Quantidade solicitada (" + qtd + ") é superior ao total de faixas de " + estilo + " cadastradas (" + musicasFiltradas.size() + ").");
        }


        Collections.shuffle(musicasFiltradas);


        System.out.println("\n======= PLAYLIST GERADA: VIBE " + estilo.toUpperCase() + " =======");
        int tempoTotalSegundos = 0;

        for (int i = 0; i < qtd; i++) {
            Musica musicaSorteada = musicasFiltradas.get(i);


            musicaSorteada.exibirDetalhes();
            tempoTotalSegundos += musicaSorteada.getDuracaoSegundos();
            System.out.println("-----------------------------------");
        }

        int minutos = tempoTotalSegundos / 60;
        int segundos = tempoTotalSegundos % 60;
        System.out.printf("Duração Total da Playlist: %d min e %d seg\n", minutos, segundos);
        System.out.println("=================================================");
    }
}