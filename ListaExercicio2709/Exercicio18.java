package usjt.ListaExercicio2709;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor\tQuadrado\tCubo\tRaiz Quadrada");

        while (true) {
            System.out.print("Digite um valor (ou 0/negativo para sair): ");
            double valor = scanner.nextDouble();

            if (valor <= 0) {
                break;
            }

            double quadrado = Math.pow(valor, 2);
            double cubo = Math.pow(valor, 3);
            double raizQuadrada = Math.sqrt(valor);

            System.out.printf("%.2f\t%.2f\t%.2f\t%.2f\n", valor, quadrado, cubo, raizQuadrada);
        }

        scanner.close();
    }
}
