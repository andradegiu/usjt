package usjt.ListaExercicio2709;
import javax.swing.JOptionPane;

public class Exercicio13 {
    public static void main(String[] args) {
        int totalCriancas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de crianças nascidas:"));
        int criancasFeminino = 0;
        int criancasMasculino = 0;
        int criancas24MesesOuMenos = 0;

        for (int i = 0; i < totalCriancas; i++) {
            char sexo = JOptionPane.showInputDialog("Digite o sexo da criança (M/F):").charAt(0);
            int tempoVida = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de vida da criança (em meses):"));

            if (sexo == 'F') {
                criancasFeminino++;
            } else {
                criancasMasculino++;
            }

            if (tempoVida <= 24) {
                criancas24MesesOuMenos++;
            }
        }

        double percentagemFeminino = ((double) criancasFeminino / totalCriancas) * 100;
        double percentagemMasculino = ((double) criancasMasculino / totalCriancas) * 100;
        double percentagem24MesesOuMenos = ((double) criancas24MesesOuMenos / totalCriancas) * 100;

        JOptionPane.showMessageDialog(null, "Percentagem de crianças do sexo feminino mortas: " + percentagemFeminino + "%");
        JOptionPane.showMessageDialog(null, "Percentagem de crianças do sexo masculino mortas: " + percentagemMasculino + "%");
        JOptionPane.showMessageDialog(null, "Percentagem de crianças que viveram 24 meses ou menos: " + percentagem24MesesOuMenos + "%");
    }
}
