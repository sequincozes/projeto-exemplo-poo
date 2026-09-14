public class EntregaExpressa extends Entrega {

    public EntregaExpressa(String endereco) {
        super(endereco);
    }

    @Override
    public double calcularTaxa(){
        return 12;
    }
}
