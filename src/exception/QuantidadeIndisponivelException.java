package exception;

public class QuantidadeIndisponivelException extends RuntimeException{
    public QuantidadeIndisponivelException(String mensagem){
        super(mensagem);
    }
}