package usjt.ListaExercicio2709;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;
        int quantidade = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        while (true) {
            System.out.print("Digite um número (ou 30000 para sair): ");
            numero = scanner.nextInt();

            if (numero == 30000) {
                break;
            }

            soma += numero;
            quantidade++;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        double media = (double) soma / quantidade;
        double mediaPares = quantidadePares > 0 ? (double) soma / quantidadePares : 0;
        double percentualImpares = (double) quantidadeImpares / quantidade * 100;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Quantidade de números: " + quantidade);
        System.out.println("Média dos números: " + media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média dos números pares: " + mediaPares);
        System.out.println("Percentual de números ímpares: " + percentualImpares + "%");

        scanner.close();
    }
}
