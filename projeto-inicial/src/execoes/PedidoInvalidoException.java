package execoes;

public class PedidoInvalidoException extends RuntimeException {
    public PedidoInvalidoException(String messagem){
        super(messagem + " - Vish mainha e vish painho!");
    }
}
