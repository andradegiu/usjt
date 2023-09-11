package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio13 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));

        if (n1 == n2 || n2 == n3 || n1 == n3) {
            JOptionPane.showMessageDialog(null, "Os números digitados são iguais");
        } else {

            int numeroMenor;
            if (n1 < n2 && n1 < n3) {
                numeroMenor = n1;
            } else if (n2 < n1 && n2 < n3) {
                numeroMenor = n2;
            } else {
                numeroMenor = n3;
            }

            int numeroMaior;
            if (n1 > n2 && n1 > n3) {
                numeroMaior = n1;
            } else if (n2 > n1 && n2 > n3) {
                numeroMaior = n2;
            } else {
                numeroMaior = n3;
            }

            int numeroMeio;
            if ((n1 > numeroMenor && n1 < numeroMaior) || (n1 < numeroMenor && n1 > numeroMaior)) {
                numeroMeio = n1;
            } else if ((n2 > numeroMenor && n2 < numeroMaior) || (n2 < numeroMenor && n2 > numeroMaior)) {
                numeroMeio = n2;
            } else {
                numeroMeio = n3;
            }            

            JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + numeroMenor + ", " + numeroMeio + ", " + numeroMaior);

        } 
    }
}
