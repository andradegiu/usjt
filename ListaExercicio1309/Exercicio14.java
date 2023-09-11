package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio14 {
    public static void main(String[] args) {
        int aluno1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno 1: "));
        int aluno2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno 2: "));
        int aluno3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno 3: "));
        int aluno4 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno 4: "));
        int aluno5 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno 5: "));
        int aluno6 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno 6: "));
        int aluno7 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno 7: "));
        int aluno8 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno 8: "));
        int aluno9 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno 9: "));
        int aluno10 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno 10: "));

        int mediaNotas = (aluno1 + aluno2 + aluno3 + aluno4 + aluno5 + aluno6 + aluno7 + aluno8 + aluno9 + aluno10) / 10;

        if (mediaNotas >= 6) {
            int alunosOito = 0;
            if (aluno1 >= 8) alunosOito++;
            if (aluno2 >= 8) alunosOito++;
            if (aluno3 >= 8) alunosOito++;
            if (aluno4 >= 8) alunosOito++;
            if (aluno5 >= 8) alunosOito++;
            if (aluno6 >= 8) alunosOito++;
            if (aluno7 >= 8) alunosOito++;
            if (aluno8 >= 8) alunosOito++;
            if (aluno9 >= 8) alunosOito++;
            if (aluno10 >= 8) alunosOito++;
            JOptionPane.showMessageDialog(null, "Alunos com nota acima de 8: " + alunosOito
            + "\n A média da sala é de: " + mediaNotas);
        } else {
            int alunosZero = 0;
            if (aluno1 == 0) alunosZero++;
            if (aluno2 == 0) alunosZero++;
            if (aluno3 == 0) alunosZero++;
            if (aluno4 == 0) alunosZero++;
            if (aluno5 == 0) alunosZero++;
            if (aluno6 == 0) alunosZero++;
            if (aluno7 == 0) alunosZero++;
            if (aluno8 == 0) alunosZero++;
            if (aluno9 == 0) alunosZero++;
            if (aluno10 == 0) alunosZero++;

            JOptionPane.showMessageDialog(null, "Alunos com nota zero: " + alunosZero
            + "\n A média da sala é de: " + mediaNotas);
        } 
    }
}
