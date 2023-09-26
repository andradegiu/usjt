package usjt.ListaExercicio2709;
import javax.swing.JOptionPane;

public class Exercicio19 {
    public static void main(String[] args) {
        int soma = 0;

        while (true) {
            int m = obterNumero("Digite o valor de m:");
            int n = obterNumero("Digite o valor de n:");

            if (m >= n) {
                break;
            }

            for (int i = m; i <= n; i++) {
                soma += i;
            }
        }

        JOptionPane.showMessageDialog(null, "A soma de todos os números inteiros entre m e n é: " + soma);
    }

    public static int obterNumero(String mensagem) {
        int numero = -1;

        while (numero < 0) {
            String input = JOptionPane.showInputDialog(mensagem);
            try {
                numero = Integer.parseInt(input);
                if (numero < 0) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro e positivo.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
            }
        }

        return numero;
    }
}
