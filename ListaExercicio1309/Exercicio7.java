package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        double valorRoupa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça de roupa: "));

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opções a seguir: " +
        "\n 0 - Comprar a vista" +
        "\n 1 - Compra parcelada no cartão" +
        "\n 2 - Crediário"));

        switch (opcao) {
            case 0:
                double vistaDesconto = valorRoupa * 0.9;
                JOptionPane.showMessageDialog(null, "O valor da peça com desconto " + vistaDesconto);
                break;
            case 1:
                int NumParcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas:"));
                double ValorParcela = valorRoupa / NumParcelas;
                JOptionPane.showMessageDialog(null, "O valor de cada parcela é: " + ValorParcela);
                break;
            case 2:
                int numParcelasCrediario = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas:"));
                double valorComJuros = valorRoupa * 1.1;
                double valorParcelaCrediario = valorComJuros / numParcelasCrediario;
                JOptionPane.showMessageDialog(null, "O valor de cada parcela com juros é: " + valorParcelaCrediario);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
            }
    }
    
}
