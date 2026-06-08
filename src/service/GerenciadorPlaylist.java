package service;
import model.Musica;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorPlaylist {
    private List<Musica> catalogo;

    public GerenciadorPlaylist() {
        this.catalogo = new ArrayList<>();
    }

    public void addMusica(Musica m) {
        this.catalogo.add(m);
        System.out.println("Música \"" + m.getTitulo() + "\" adicionada com sucesso!");
    }


    public void listarTodas() {
        if (this.catalogo.isEmpty()) {
            System.out.println("O catálogo está vazio.");
            return;
        }
        for (Musica m : this.catalogo) {
            m.exibirDetalhes();
        }
    }

    public void gerarPlaylist(String estilo, int qtd) {
        List<Musica> filtradas = new ArrayList<>();

        for (Musica m : this.catalogo) {
            if (m.getClass().getSimpleName().equalsIgnoreCase(estilo)) {
                filtradas.add(m);
            }
        }

        if (filtradas.isEmpty()) {
            System.out.println("[Aviso] Nenhuma música encontrada para o gênero: " + estilo);
            return;
        }

        if (qtd > filtradas.size()) {
            System.out.println("[Aviso] Quantidade solicitada (" + qtd + ") é maior que o acervo de "
                    + estilo + " (" + filtradas.size() + "). Exibindo todas as disponíveis:");
            qtd = filtradas.size();
        }

        System.out.println("\n===== SUA PLAYLIST VIBEMATCH DE " + estilo.toUpperCase() + " =====");
        for (int i = 0; i < qtd; i++) {
            System.out.print((i + 1) + ". ");
            filtradas.get(i).exibirDetalhes();
        }

    }
}