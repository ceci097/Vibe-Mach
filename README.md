# Vibe-Mach

Sistema inteligente para gerenciamento, catalogação e estruturação de acervos musicais, com suporte à geração automatizada de playlists personalizadas por gênero e validação rigorosa de regras de negócio.

O objetivo do sistema é fornecer uma plataforma robusta e consistente para o controle de faixas digitais, prevenindo erros de entrada no catálogo através de validações automáticas de dados e tratamento customizado de exceções.

##  Funcionalidades do Sistema

* **Catálogo Amplo e Segmentado de Gêneros:** 
* **Motor de Gerenciamento de Playlists:** Funcionalidade centralizada responsável por estruturar, agrupar e listar as faixas musicais de forma coordenada e inteligente.
* **Validação Rigorosa de Dados (Proteção do Acervo):** * Impede o cadastro de músicas com identificações essenciais em branco (título ou artista vazios).
    * Bloqueia a inserção de faixas com tempos de duração inválidos (menores ou iguais a zero segundos).
* **Tratamento Customizado de Erros (Segurança do Sistema):**
    * Detecção e interrupção imediata caso se tente operar ou consultar um catálogo que esteja totalmente vazio.
    * Emissão de alertas específicos caso um estilo musical solicitado não seja encontrado ou caso as quantidades de faixas estejam indisponíveis.

## Tecnologias Utilizadas

* **Java** (Linguagem base do ecossistema)
* **JUnit 5** (Validação automatizada das regras de negócio através de testes unitários)
* **JavaDoc** (Documentação estrutural das APIs e comportamentos do sistema)

##  Organização das Pastas e Arquivos

```text
Vibe-Mach/
├── docs/                # Páginas de documentação JavaDoc geradas para o projeto
├── src/                 # Código-fonte funcional do sistema
│   ├── exception/       # Erros customizados (Catálogo Vazio, Estilo Não Encontrado, etc.)
│   ├── interfaces/      # Contratos e especificações base do sistema (IMusica)
│   ├── model/           # Classes representativas das músicas e seus gêneros (Rock, Pop, etc.)
│   ├── service/         # Componente centralizador das regras (GerenciadorPlaylist)
│   └── Main.java        # Ponto de entrada e inicialização do programa
├── test/                # Suíte de validações e testes automatizados
│   └── model/           # Testes específicos para validação das regras de faixas (MusicaTest)
└── README.md            # Apresentação do projeto e manual de funcionalidades (este arquivo)