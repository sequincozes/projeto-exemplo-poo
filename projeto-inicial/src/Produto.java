public class Produto {
    private String descricao;
    private double preco;

    Produto(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }
}
