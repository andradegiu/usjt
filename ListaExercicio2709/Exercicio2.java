package usjt.ListaExercicio2709;
import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro e positivo para N:"));
        double E = 1.0;
        int fatorial = 1;

        for (int i = 1; i <= N; i++) {
            fatorial *= i;
            E += 1.0 / fatorial;
        }

        JOptionPane.showMessageDialog(null, "O valor de E é: " + E);
    }
}

