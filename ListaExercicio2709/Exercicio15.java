package usjt.ListaExercicio2709;
import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {
        int quantidadeProdutos = 12;
        double[] precoUnitario = new double[quantidadeProdutos];
        char[] refrigeracao = new char[quantidadeProdutos];
        char[] categoria = new char[quantidadeProdutos];
        double[] custoEstocagem = new double[quantidadeProdutos];
        double[] imposto = new double[quantidadeProdutos];
        double[] precoFinal = new double[quantidadeProdutos];
        String[] classificacao = new String[quantidadeProdutos];
        double somaCustosEstocagem = 0;
        double somaImpostos = 0;
        double maiorPrecoFinal = Double.MIN_VALUE;
        double menorPrecoFinal = Double.MAX_VALUE;
        int quantidadeBarato = 0;
        int quantidadeCaro = 0;
        int quantidadeNormal = 0;

        for (int i = 0; i < quantidadeProdutos; i++) {
            precoUnitario[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitário do produto " + (i + 1) + ":"));
            refrigeracao[i] = JOptionPane.showInputDialog("O produto necessita de refrigeração? (S/N)").charAt(0);
            categoria[i] = JOptionPane.showInputDialog("Digite a categoria do produto (A/L/V):").charAt(0);

            // Cálculo do custo de estocagem
            if (precoUnitario[i] <= 20) {
                switch (categoria[i]) {
                    case 'A':
                        custoEstocagem[i] = 2.0;
                        break;
                    case 'L':
                        custoEstocagem[i] = 3.0;
                        break;
                    case 'V':
                        custoEstocagem[i] = 4.0;
                        break;
                }
            } else if (precoUnitario[i] <= 50) {
                if (refrigeracao[i] == 'S') {
                    custoEstocagem[i] = 6.0;
                } else {
                    custoEstocagem[i] = 0.0;
                }
            } else {
                if (categoria[i] == 'A' && refrigeracao[i] == 'S') {
                    custoEstocagem[i] = 5.0;
                } else if (categoria[i] == 'L') {
                    custoEstocagem[i] = 2.0;
                } else if (categoria[i] == 'V') {
                    custoEstocagem[i] = 4.0;
                } else {
                    custoEstocagem[i] = 0.0;
                }
            }

            if (categoria[i] == 'A' && refrigeracao[i] == 'S') {
                imposto[i] = precoUnitario[i] * 0.04;
            } else {
                imposto[i] = precoUnitario[i] * 0.02;
            }

            precoFinal[i] = precoUnitario[i] + custoEstocagem[i] + imposto[i];
            somaCustosEstocagem += custoEstocagem[i];
            somaImpostos += imposto[i];

            if (precoFinal[i] > maiorPrecoFinal) {
                maiorPrecoFinal = precoFinal[i];
            }

            if (precoFinal[i] < menorPrecoFinal) {
                menorPrecoFinal = precoFinal[i];
            }

            if (precoFinal[i] <= 20) {
                classificacao[i] = "Barato";
                quantidadeBarato++;
            } else if (precoFinal[i] <= 100) {
                classificacao[i] = "Normal";
                quantidadeNormal++;
            } else {
                classificacao[i] = "Caro";
                quantidadeCaro++;
            }
        }

        double mediaCustosEstocagemImpostos = (somaCustosEstocagem + somaImpostos) / quantidadeProdutos;

        JOptionPane.showMessageDialog(null, "Tabela de Produtos\n\n"
                + "Preço Unitário\tRefrigeração\tCategoria\tCusto de Estocagem\tImposto\tPreço Final\tClassificação\n");

        for (int i = 0; i < quantidadeProdutos; i++) {
            JOptionPane.showMessageDialog(null, precoUnitario[i] + "\t" + refrigeracao[i] + "\t" + categoria[i] + "\t" + custoEstocagem[i] + "\t" + imposto[i] + "\t" + precoFinal[i] + "\t" + classificacao[i] + "\n");
        }

        JOptionPane.showMessageDialog(null, "Estatísticas:\n\n"
                + "Média dos custos de estocagem e impostos: " + mediaCustosEstocagemImpostos + "\n"
                + "Maior preço final: " + maiorPrecoFinal + "\n"
                + "Menor preço final: " + menorPrecoFinal + "\n"
                + "Total de impostos: " + somaImpostos + "\n"
                + "Quantidade de produtos baratos: " + quantidadeBarato + "\n"
                + "Quantidade de produtos caros: " + quantidadeCaro + "\n"
                + "Quantidade de produtos normais: " + quantidadeNormal);
    }
}
