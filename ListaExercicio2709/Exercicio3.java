package usjt.ListaExercicio2709;
import javax.swing.JOptionPane;

public class Exercicio3 {
     public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de valores a serem lidos:"));

        for (int i = 0; i < N; i++) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro e positivo:"));
            int fatorial = 1;
            for (int j = 1; j <= valor; j++) {
                fatorial *= j;
            }
            String tabela = "Valor: " + valor + "\nFatorial: " + fatorial;
            
            JOptionPane.showMessageDialog(null, tabela);
        }
    }
}





