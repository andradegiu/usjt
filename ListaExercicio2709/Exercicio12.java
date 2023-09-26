package usjt.ListaExercicio2709;
import javax.swing.JOptionPane;

public class Exercicio12 {
    public static void main(String[] args) {
        final double SALARIO_MINIMO = 450.0;
        final int TOTAL_OPERARIOS = 15;
        
        int numeroOperarioMaiorSalario = 0;
        double maiorSalario = 0;
        double totalFolhaPagamento = 0;
        int totalPecasFabricadas = 0;
        int totalPecasHomens = 0;
        int totalPecasMulheres = 0;

        for (int i = 0; i < TOTAL_OPERARIOS; i++) {
            int numeroOperario = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do operário:"));
            int pecasFabricadas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de peças fabricadas:"));
            char sexo = JOptionPane.showInputDialog("Digite o sexo do operário (M/F):").charAt(0);

            double salario = 0;

            if (pecasFabricadas <= 30) {
                salario = SALARIO_MINIMO;
            } else if (pecasFabricadas >= 21 && pecasFabricadas <= 31) {
                salario = SALARIO_MINIMO + (0.03 * SALARIO_MINIMO * (pecasFabricadas - 30));
            } else {
                salario = SALARIO_MINIMO + (0.05 * SALARIO_MINIMO * (pecasFabricadas - 30));
            }

            totalFolhaPagamento += salario;
            totalPecasFabricadas += pecasFabricadas;

            if (sexo == 'M') {
                totalPecasHomens += pecasFabricadas;
            } else {
                totalPecasMulheres += pecasFabricadas;
            }

            if (salario > maiorSalario) {
                maiorSalario = salario;
                numeroOperarioMaiorSalario = numeroOperario;
            }

            JOptionPane.showMessageDialog(null, "Operário " + numeroOperario + ", Salário: R$" + salario);
        }

        double mediaPecasHomens = (double) totalPecasHomens / (TOTAL_OPERARIOS / 2);
        double mediaPecasMulheres = (double) totalPecasMulheres / (TOTAL_OPERARIOS / 2);

        JOptionPane.showMessageDialog(null, "Total da folha de pagamento: R$" + totalFolhaPagamento);
        JOptionPane.showMessageDialog(null, "Total de peças fabricadas: " + totalPecasFabricadas);
        JOptionPane.showMessageDialog(null, "Média de peças fabricadas pelos homens: " + mediaPecasHomens);
        JOptionPane.showMessageDialog(null, "Média de peças fabricadas pelas mulheres: " + mediaPecasMulheres);
        JOptionPane.showMessageDialog(null, "Operário com maior salário: " + numeroOperarioMaiorSalario);
    }
}
