package usjt.ListaExercicio2709;
import javax.swing.JOptionPane;

public class Exercicio1 {
public static void main(String[] args) {
        int anoContratacao = 2005;
        double salario = 1000.0;
        double percentualAumento = 1.5; 
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));

        for (int ano = anoContratacao + 1; ano <= anoAtual; ano++) {
            salario += salario * (percentualAumento / 100);
            percentualAumento *= 2; 
        }

        JOptionPane.showMessageDialog(null, "O salário atual é: R$" + salario);
    }
}