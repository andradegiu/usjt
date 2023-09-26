package usjt.ListaExercicio2709;
import javax.swing.JOptionPane;

public class Exercicio14 {
        public static void main(String[] args) {
        double divida = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da dívida (R$):"));
        String tabela = "Valor da dívida\tValor dos juros\tQuantidade de parcelas\tValor da parcela\n";

        for (int parcelas = 1; parcelas <= 12; parcelas += 3) {
            double juros = calcularJuros(parcelas, divida);
            double valorParcela = (divida + juros) / parcelas;

            tabela += String.format("R$ %.2f\tR$ %.2f\t%d\tR$ %.2f\n", divida, juros, parcelas, valorParcela);
        }

        JOptionPane.showMessageDialog(null, tabela);
    }

    public static double calcularJuros(int parcelas, double divida) {
        double percentualJuros = 0.0;

        switch (parcelas) {
            case 1:
                percentualJuros = 0.0;
                break;
            case 3:
                percentualJuros = 0.10;
                break;
            case 6:
                percentualJuros = 0.15;
                break;
            case 9:
                percentualJuros = 0.20;
                break;
            case 12:
                percentualJuros = 0.25;
                break;
        }

        return divida * percentualJuros;
    }
}
