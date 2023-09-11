package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));

        int soma = n1 + n2 +n3;
        int media = soma / 3;
        int produto = n1 - n2 - n3;
        int menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        int maior = n1;
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma + 
        "\nA média dos números é: " + media +
        "\n O produtos dos números é: " + produto +
        "\nO menor número é: " + menor +
        "\nO maior número é: " + maior);
    }
}