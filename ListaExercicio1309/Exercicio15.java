package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {
        double valorHora = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da hora trabalhada: "));
        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        double imposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do imposto (entre 0-1): "));
        double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da comissão: "));

        double salarioBruto = valorHora * horasTrabalhadas;
        double salarioLiquidoComissao = salarioBruto - imposto + comissao;
        double salarioLiquido = salarioBruto -imposto;

        if (horasTrabalhadas >= 120) {
            JOptionPane.showMessageDialog(null, "Salário Bruto: " + salarioBruto + "\n Salário Líquido com Comissão: " 
            + salarioLiquidoComissao + "\n Valor Comissão: " + comissao);
        } else {
            JOptionPane.showMessageDialog(null, "Salário Bruto: " + salarioBruto + "\n Salário Líquido sem Comissão: " 
            + salarioLiquido + "\n Horas trabalhadas: " + horasTrabalhadas);
        }
    } 
}
