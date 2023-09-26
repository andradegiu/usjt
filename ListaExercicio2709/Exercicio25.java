package usjt.ListaExercicio2709;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalImpostos = 0;

        while (true) {
            System.out.print("Informe o preço unitário (ou valor negativo para encerrar): ");
            double precoUnitario = scanner.nextDouble();

            if (precoUnitario <= 0) {
                break;
            }

            System.out.print("Informe o país de origem (1 – Estados Unidos, 2 – México, 3 – Outros): ");
            int paisOrigem = scanner.nextInt();

            System.out.print("Informe o meio de transporte (T – terrestre, F – fluvial, A – aéreo): ");
            char meioTransporte = scanner.next().charAt(0);

            System.out.print("Informe se há carga perigosa (S – Sim, N – Não): ");
            char cargaPerigosa = scanner.next().charAt(0);

            double imposto = calcularImposto(precoUnitario);
            totalImpostos += imposto;

            double valorTransporte = calcularValorTransporte(cargaPerigosa, paisOrigem);
            double valorSeguro = calcularValorSeguro(paisOrigem, meioTransporte, precoUnitario);
            double precoFinal = precoUnitario + imposto + valorTransporte + valorSeguro;

            System.out.println("Imposto: R$" + imposto);
            System.out.println("Valor do transporte: R$" + valorTransporte);
            System.out.println("Valor do seguro: R$" + valorSeguro);
            System.out.println("Preço final: R$" + precoFinal);
        }

        System.out.println("Total dos impostos: R$" + totalImpostos);

        scanner.close();
    }

    public static double calcularImposto(double precoUnitario) {
        if (precoUnitario <= 100) {
            return precoUnitario * 0.05;
        } else {
            return precoUnitario * 0.10;
        }
    }

    public static double calcularValorTransporte(char cargaPerigosa, int paisOrigem) {
        if (cargaPerigosa == 'S') {
            switch (paisOrigem) {
                case 1:
                    return 50;
                case 2:
                    return 21;
                case 3:
                    return 24;
            }
        } else {
            switch (paisOrigem) {
                case 1:
                    return 12;
                case 2:
                    return 21;
                case 3:
                    return 60;
            }
        }
        return 0; 
    }

    public static double calcularValorSeguro(int paisOrigem, char meioTransporte, double precoUnitario) {
        if (paisOrigem == 2 || meioTransporte == 'A') {
            return precoUnitario * 0.5;
        } else {
            return 0;
        }
    }
}
