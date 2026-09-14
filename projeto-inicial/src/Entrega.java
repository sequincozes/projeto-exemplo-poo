public class Entrega {

    String endereco;
    Pedido pedido;

    public Entrega(String endereco) {
        this.endereco = endereco;
        this.pedido = pedido;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        // Controle de acesso (autorização)
        this.endereco = endereco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public double calcularTaxa(){
        return 5;
    }

}
