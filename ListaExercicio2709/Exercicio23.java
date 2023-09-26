package usjt.ListaExercicio2709;
import java.util.Scanner;

public class Exercicio23 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        double valorQuilowatt = salarioMinimo / 8;

        double faturamentoGeral = 0;
        int consumidoresEntre500e1000 = 0;

        while (true) {
            System.out.print("Informe a quantidade de quilowatts (ou 0 para encerrar): ");
            int quilowatts = scanner.nextInt();

            if (quilowatts == 0) {
                break;
            }

            System.out.print("Informe o tipo de consumidor (1 - residencial, 2 - comercial, 3 - industrial): ");
            int tipoConsumidor = scanner.nextInt();

            double valorGasto = quilowatts * valorQuilowatt;

            double acrescimo = 0;
            switch (tipoConsumidor) {
                case 1:
                    acrescimo = valorGasto * 0.05;
                    break;
                case 2:
                    acrescimo = valorGasto * 0.10;
                    break;
                case 3:
                    acrescimo = valorGasto * 0.15;
                    break;
                default:
                    System.out.println("Tipo de consumidor inválido. Por favor, tente novamente.");
                    continue;
            }

            double valorFinal = valorGasto + acrescimo;
            faturamentoGeral += valorFinal;

            if (valorFinal >= 500 && valorFinal <= 1000) {
                consumidoresEntre500e1000++;
            }
        }

        System.out.println("Valor de cada quilowatt: R$" + valorQuilowatt);
        System.out.println("Faturamento geral da empresa: R$" + faturamentoGeral);
        System.out.println("Quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + consumidoresEntre500e1000);

        scanner.close();
    }
}
