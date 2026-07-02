package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MusicaTest {
    private Musica musica;

    @BeforeEach
    void setUp(){
        musica= new Pop("As it was", "Harry Styles", 167);

    }
    @Test
    void TesteAlterarDadosComSucesso(){
        musica.setTitulo("Novo título");
        musica.setArtista("Novo artista");
    }
}