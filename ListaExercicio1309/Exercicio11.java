package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        int codigoEstado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do código do Estado: "));
        double valorCargaInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor inicial da carga: "));
        double valorCargaFinal = 0.0;

        switch (codigoEstado) {
            case 2:
            case 5:
                valorCargaFinal = valorCargaInicial - (0.12 * valorCargaInicial);
                break;
            case 1:
            case 3:
            case 4:
                valorCargaFinal = valorCargaInicial - (0.15 * valorCargaInicial);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código do Estado inválido");
                break;
            }
            
            JOptionPane.showMessageDialog(null, "O valor final da carga é: " + valorCargaFinal);
    }
}
