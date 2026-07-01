package exception;
public class EstiloNaoEncontradoException extends RuntimeException{
    public EstiloNaoEncontradoException(String mensagem){
        super(mensagem);
    }
}