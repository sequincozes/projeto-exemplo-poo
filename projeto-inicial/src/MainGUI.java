import javax.swing.*;
import java.awt.*;

public class MainGUI {
    static JFrame tela = new JFrame("Delivery");
    static JTextField campoQuantidade = new JTextField("1");
    static JTextField nomeCliente = new JTextField("");
    static JTextField endereco = new JTextField("");
    static JCheckBox expressa = new JCheckBox("Entrega expressa");
    static JButton botao = new JButton("Calcular pedido");
    static JLabel resultado = new JLabel("Total: ");

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
                    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    tela.setLayout(new GridLayout(0, 2, 10, 10));

                    //Componentes
                    tela.add(new JLabel("Cliente:"));
                    tela.add(nomeCliente);

                    tela.add(new JLabel("Endereço:"));
                    tela.add(endereco);

                    tela.add(new JLabel("Quantidade:"));
                    tela.add(campoQuantidade);

                    tela.add(new JLabel("Tipo de entrega:"));
                    tela.add(expressa);

                    tela.add(botao);
                    tela.add(resultado);

                    // Evento do botão
                    botao.addActionListener(e -> {
                        int quantidade = Integer.parseInt(campoQuantidade.getText());
                        Produto produto = new Produto("Hamburger", 25);
                        Cliente cliente = new Cliente(nomeCliente.getText());
                        Entrega entrega = expressa.isSelected()
                                ? new EntregaExpressa(nomeCliente.getText())
                                : new Entrega(nomeCliente.getText());
                        Pedido pedido = new Pedido(cliente, produto, quantidade, entrega);

                        resultado.setText(
                                "Total: R$ "
                                        + pedido.calcularSubtotal()
                        );
                    });

                    // Ajusta o tamanho aos componentes
                    tela.pack();

                    // Centralizar
                    tela.setLocationRelativeTo(null);

                    // Exibir a tela
                    tela.setVisible(true);

                }
        );

    }
}
