package usjt.ListaExercicio2709;
import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        int totalAlunos = 6;
        double[] medias = new double[totalAlunos];
        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        double totalNotas = 0.0;

        for (int i = 0; i < totalAlunos; i++) {
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno " + (i+1) + ":"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno " + (i+1) + ":"));

            double media = (nota1 + nota2) / 2;
            medias[i] = media;

            if (media <= 3.0) {
                JOptionPane.showMessageDialog(null, "Aluno " + (i+1) + ": Reprovado");
                reprovados++;
            } else if (media < 7.0) {
                JOptionPane.showMessageDialog(null, "Aluno " + (i+1) + ": Exame");
                exame++;
            } else {
                JOptionPane.showMessageDialog(null, "Aluno " + (i+1) + ": Aprovado");
                aprovados++;
            }

            totalNotas += media;
        }

        double mediaClasse = totalNotas / totalAlunos;

        JOptionPane.showMessageDialog(null, "Total de alunos aprovados: " + aprovados);
        JOptionPane.showMessageDialog(null, "Total de alunos de exame: " + exame);
        JOptionPane.showMessageDialog(null, "Total de alunos reprovados: " + reprovados);
        JOptionPane.showMessageDialog(null, "Média da classe: " + mediaClasse);
    }
}
