package usjt.ListaExercicio2709;
import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        int totalTimes = 5;
        int totalJogadores = totalTimes * 11;
        int jogadoresMenor18 = 0;
        double totalAlturas = 0.0;
        int jogadoresMais80Kg = 0;

        for (int i = 0; i < totalTimes; i++) {
            double alturaTime = 0.0;

            for (int j = 0; j < 11; j++) {
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do jogador " + (j+1) + " do time " + (i+1) + ":"));
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso (em kg) do jogador " + (j+1) + " do time " + (i+1) + ":"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura (em metros) do jogador " + (j+1) + " do time " + (i+1) + ":"));

                if (idade < 18) {
                    jogadoresMenor18++;
                }

                totalAlturas += altura;
                alturaTime += altura;

                if (peso > 80) {
                    jogadoresMais80Kg++;
                }
            }

            double mediaAlturasTime = alturaTime / 11;
            JOptionPane.showMessageDialog(null, "Média de alturas do time " + (i+1) + ": " + mediaAlturasTime);
        }

        double mediaAlturasCampeonato = totalAlturas / totalJogadores;
        double percentagemMais80Kg = ((double) jogadoresMais80Kg / totalJogadores) * 100;

        JOptionPane.showMessageDialog(null, "Quantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenor18);
        JOptionPane.showMessageDialog(null, "Média de alturas de todos os jogadores do campeonato: " + mediaAlturasCampeonato);
        JOptionPane.showMessageDialog(null, "Percentagem de jogadores com mais de 80 kg: " + percentagemMais80Kg + "%");
    }
}
