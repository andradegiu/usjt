package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        int inteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        double real = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real" ));
        
        if (inteiro < real) {
            JOptionPane.showMessageDialog(null, "Número inteiro menor que o real");
        } else {
            JOptionPane.showMessageDialog(null, "Número inteiro maior que o real");
        }
    }
}