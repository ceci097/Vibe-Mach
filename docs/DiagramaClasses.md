classDiagram
class IMusica {
<<interface>>
+exibirDetalhes() void
+getDuracaoSegundos() int
}

    class Musica {
        <<abstract>>
        -titulo: String
        -artista: String
        -duracaoSegundos: int
        +Musica(titulo: String, artista: String, duracaoSegundos: int)
        +getTitulo() String
        +setTitulo(titulo: String) void
        +getArtista() String
        +setArtista(artista: String) void
        +getDuracaoSegundos() int
        +setDuracaoSegundos(duracaoSegundos: int) void
        +exibirDetalhes() void*
    }

    class Rock {
        +Rock(titulo: String, artista: String, duracaoSegundos: int)
        +exibirDetalhes() void
    }

    class Pop {
        +Pop(titulo: String, artista: String, duracaoSegundos: int)
        +exibirDetalhes() void
    }

    class Eletronica {
        +Eletronica(titulo: String, artista: String, duracaoSegundos: int)
        +exibirDetalhes() void
    }

    class Sertanejo {
        +Sertanejo(titulo: String, artista: String, duracaoSegundos: int)
        +exibirDetalhes() void
    }

    class Jazz {
        +Jazz(titulo: String, artista: String, duracaoSegundos: int)
        +exibirDetalhes() void
    }

    class Rap {
        +Rap(titulo: String, artista: String, duracaoSegundos: int)
        +exibirDetalhes() void
    }

    class MPB {
        +MPB(titulo: String, artista: String, duracaoSegundos: int)
        +exibirDetalhes() void
    }

    class GerenciadorPlaylist {
        -catalogo: List~Musica~
        +GerenciadorPlaylist()
        +adicionarMusica(m: Musica) void
        -validarCatalogoNaoVazio() void
        +listarTodas() void
        +gerarPlaylist(estilo: String, qtd: int) void
    }

    IMusica <|.. Musica : Implementa
    Musica <|-- Rock : Herda
    Musica <|-- Pop : Herda
    Musica <|-- Eletronica : Herda
    Musica <|-- Sertanejo : Herda
    Musica <|-- Jazz : Herda
    Musica <|-- Rap : Herda
    Musica <|-- MPB : Herda
    GerenciadorPlaylist o-- Musica : Agrega