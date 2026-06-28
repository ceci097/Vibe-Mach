package model;
public class EstiloNaoEncontradoException extends RuntimeException{
    public EstiloNaoEncontradoException(String mensagem){
        super(mensagem);
    }
}