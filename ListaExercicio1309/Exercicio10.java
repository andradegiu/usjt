package usjt.ListaExercicio1309;
import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
    
        double valorMistoQuente = 5.50;
        double valorSaladaChinesa = 10.20;
        double valorSucoLaranja = 4.00;
        double valorSucoManga = 3.50;

        String mensagemBebida = "Tenha um excelente drink";
        String mensagemComida = "Bom apetite";

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção que deseja comprar: " +
        "\n 1- Misto Quente" +
        "\n 2- Salada Chinesa" +
        "\n 3- Suco de Laranha" +
        "\n 4- Suco de Manga"));

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null,  mensagemComida + ", vai lhe custar " + valorMistoQuente);
                break;
            case 2: 
                JOptionPane.showMessageDialog(null, mensagemComida + ", vai lhe custar " + valorSaladaChinesa);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, mensagemBebida + ", vai lhe custar " + valorSucoLaranja);
                break;
            case 4: 
                JOptionPane.showMessageDialog(null, mensagemBebida + ", vai lhe custar: " + valorSucoManga);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
                break;
        }
    }
}
