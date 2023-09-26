package usjt.ListaExercicio2709;
import javax.swing.JOptionPane;

public class Exercicio17 {
     public static void main(String[] args) {
        double salarioCarlos = obterSalario("Digite o salário de Carlos (R$):");
        double salarioJoao = salarioCarlos / 3;
        double rendimentoCarlos = 0.02;
        double rendimentoJoao = 0.05;
        int meses = 0;

        while (salarioJoao <= salarioCarlos) {
            salarioCarlos += salarioCarlos * rendimentoCarlos;
            salarioJoao += salarioJoao * rendimentoJoao;
            meses++;
        }

        JOptionPane.showMessageDialog(null, "Levará " + meses + " meses para que o valor de João seja igual ou ultrapasse o valor de Carlos.");
    }

    public static double obterSalario(String mensagem) {
        double salario = -1;

        while (salario <= 0) {
            String input = JOptionPane.showInputDialog(mensagem);
            try {
                salario = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido.");
            }
        }
        return salario;
    }
}
