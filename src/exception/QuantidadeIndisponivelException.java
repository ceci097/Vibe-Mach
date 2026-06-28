package model;

public class QuantidadeIndisponivelException extends RuntimeException{
    public QuantidadeIndisponivelException(String mensagem){
        super(mensagem);
    }
}