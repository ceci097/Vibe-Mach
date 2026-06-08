```mermaid
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
        +getTitulo() String
        +getArtista() String
        +getDuracaoSegundos() int
        +exibirDetalhes() void
    }

    class Rock {
        -subgenero: String
        +Rock(titulo: String, artista: String, duracao: int, subgenero: String)
        +getSubgenero() String
        +exibirDetalhes() void
    }

    class Pop {
        -bpm: int
        +Pop(titulo: String, artista: String, duracao: int, bpm: int)
        +getBpm() int
        +exibirDetalhes() void
    }

    class Eletronica {
        -tipoSintetizador: String
        +Eletronica(titulo: String, artista: String, duracao: int, tipoSintetizador: String)
        +getTipoSintetizador() String
        +exibirDetalhes() void
    }

    class Sertanejo {
        -dupla: String
        +Sertanejo(titulo: String, artista: String, duracao: int, dupla: String)
        +getDupla() String
       +exibirDetalhes() void
    }

    class Jazz {
        -instrumentoSolo: String
        +Jazz(titulo: String, artista: String, duracao: int, instrumentoSolo: String)
        +getInstrumentoSolo() String
        +exibirDetalhes() void
    }

    class Rap {
        -rimasPorMinuto: int
        +Rap(titulo: String, artista: String, duracao: int, rimasPorMinuto: int)
        +getRimasPorMinuto() int
+exibirDetalhes() void
    }

    class MPB {
        -movimento: String
        +MPB(titulo: String, artista: String, duracao: int, movimento: String)
        +getMovimento() String
        +exibirDetalhes() void
    }

    class GerenciadorPlaylist {
        -catalogo: List~Musica~
        +adicionarMusica(m: Musica) void
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
