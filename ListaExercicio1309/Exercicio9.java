package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: ")); 
        double media = (nota1 + nota2) / 2;
        
        String categoria;
        if (media <= 2) {
            categoria = "Reprovado. Nos vemos semestre que vem.";
        } else if (media <= 6 ) {
            categoria = "Não está aprovado mas ainda pode fazer a segunda época";
        } else if (media <=7) {
            categoria = "Aprovado no limite, estude um pouco mais.";
        } else if (media <=9) {
            categoria = "Aprovado";
        } else {
            categoria = "Parabéns, continue assim!";
        }

        JOptionPane.showMessageDialog(null, "Sua média é: " + media +
        "\n" + categoria);
    }
    
}
