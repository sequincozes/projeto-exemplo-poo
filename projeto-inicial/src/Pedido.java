import execoes.PedidoInvalidoException;

public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    Entrega entrega;


    Pedido(Cliente cliente, Produto produto, int quantidade, Entrega entrega){
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.entrega = entrega;
    }

    public double calcularSubtotal(){
        if (produto.getPreco() <= 0 ){
            throw new PedidoInvalidoException("O valor não pode ser negativo!");
        }
        return produto.getPreco() * quantidade + entrega.calcularTaxa();
    }

}
