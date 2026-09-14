import execoes.PedidoInvalidoException;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Silvio");
        Produto produto = new Produto("Hamburger", 25);
        EntregaExpressa entregaExpressa = new EntregaExpressa("Rua zero");

        Pedido pedido = new Pedido(cliente, produto, 5, entregaExpressa);

        try {
           double valor = pedido.calcularSubtotal();
           System.out.println(valor);
        } catch (PedidoInvalidoException e){
            System.out.println("Verifique, por favor, o valor do pedido. Não...");
        }
    }
}
