package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        double SaldoConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o Saldo Bancário: "));
        double SacarValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar: "));
    
        double SaldoRemanescente = SaldoConta - SacarValor;

        if (SaldoConta > SacarValor) {
            JOptionPane.showMessageDialog(null, "É possível realizar o saque" +
            "\n Saldo Remanescente: " + SaldoRemanescente );
        } else {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
        }
        
    }

    
}
