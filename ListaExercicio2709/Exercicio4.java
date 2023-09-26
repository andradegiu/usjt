package usjt.ListaExercicio2709;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] codigosCidades = {1, 2, 3, 4, 5};
        int[] veiculosPasseio = {1500, 2200, 1800, 1900, 2100};
        int[] acidentesTransito = {20, 15, 25, 10, 18};
        int maiorIndice = -1;
        int menorIndice = Integer.MAX_VALUE;
        int cidadeMaior = -1;
        int cidadeMenor = -1;

        for (int i = 0; i < codigosCidades.length; i++) {
            int indice = acidentesTransito[i] * 1000 / veiculosPasseio[i];

            if (indice > maiorIndice) {
                maiorIndice = indice;
                cidadeMaior = codigosCidades[i];
            }

            if (indice < menorIndice) {
                menorIndice = indice;
                cidadeMenor = codigosCidades[i];
            }
        }

        System.out.println("a) Maior índice de acidentes: " + maiorIndice + " (Cidade " + cidadeMaior + ")");
        System.out.println("   Menor índice de acidentes: " + menorIndice + " (Cidade " + cidadeMenor + ")");

        int totalVeiculos = 0;
        for (int veiculo : veiculosPasseio) {
            totalVeiculos += veiculo;
        }

        double mediaVeiculos = (double) totalVeiculos / codigosCidades.length;
        System.out.println("b) Média de veículos: " + mediaVeiculos);

        int totalAcidentesCidadesMenos2000 = 0;
        int totalCidadesMenos2000 = 0;

        for (int i = 0; i < codigosCidades.length; i++) {
            if (veiculosPasseio[i] < 2000) {
                totalAcidentesCidadesMenos2000 += acidentesTransito[i];
                totalCidadesMenos2000++;
            }
        }

        double mediaAcidentesCidadesMenos2000 = (double) totalAcidentesCidadesMenos2000 / totalCidadesMenos2000;
        System.out.println("c) Média de acidentes nas cidades com menos de 2.000 veículos: " + mediaAcidentesCidadesMenos2000);
    }
}
