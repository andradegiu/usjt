package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));

        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, + n1 + " é o maior ");
        } else if (n1 < n2) {
            JOptionPane.showMessageDialog(null, + n2 + " é maior");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }
    }
    
}
