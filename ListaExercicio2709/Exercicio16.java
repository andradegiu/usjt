package usjt.ListaExercicio2709;
import javax.swing.JOptionPane;

public class Exercicio16 {
    public static void main(String[] args) {
        double base = obterMedida("Digite o valor da base do triângulo:");
        double altura = obterMedida("Digite o valor da altura do triângulo:");

        if (base > 0 && altura > 0) {
            double area = calcularAreaTriangulo(base, altura);
            JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
        } else {
            JOptionPane.showMessageDialog(null, "As medidas informadas são inválidas. Por favor, insira valores maiores que zero.");
        }
    }

    public static double obterMedida(String mensagem) {
        double medida = -1;

        while (medida <= 0) {
            String input = JOptionPane.showInputDialog(mensagem);
            try {
                medida = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido.");
            }
        }

        return medida;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
