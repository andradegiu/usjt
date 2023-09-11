package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número interiro: "));   
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "Primeiro número maior que o segundo");
        } else {
            JOptionPane.showMessageDialog(null, "Segundo número maior que o primeiro");
        }
    }
}
