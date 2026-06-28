package exception;

public class CatalogoVazio extends RuntimeException {
    public CatalogoVazio(String message) {

        super(message);
    }
}
