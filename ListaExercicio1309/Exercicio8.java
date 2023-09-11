package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
    double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
    double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
    double imc = peso / (altura * altura);

        String imcMensagem;
            if (imc < 18.5) {
                imcMensagem = "Abaixo do peso ideal.";
            } else if (imc <= 24.9) {
                imcMensagem = "Peso ideal, muito bem.";
            } else if (imc <= 29.9) {
                imcMensagem = "Sobrepeso, um regime leve pode ajudar.";
            } else if (imc <= 34.9) {
                imcMensagem = "Obesidade leve.";
            } else if (imc <= 39.9) {
                imcMensagem = "Obesidade moderada.";
            } else {
                imcMensagem = "Obesidade mórbida.";
            }
    
        JOptionPane.showMessageDialog(null, "O seu imc é de: " + imc +
        "\n Considerado: " + imcMensagem);
    }
    
}
