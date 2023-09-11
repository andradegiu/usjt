package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio2 {
        public static void main(String[] args) {
        double numeroreal1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número real: "));
        double numeroreal2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número real: "));

        if (numeroreal1 == numeroreal2) {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são diferentes");
        }
    }
}
