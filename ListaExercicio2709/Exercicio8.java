package usjt.ListaExercicio2709;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int numTermos = scanner.nextInt();

        int valor = 2;
        for (int i = 0; i < numTermos; i++) {
            if (i % 2 == 0) {
                valor = valor * 3;
            } else {
                valor = (valor * 2) - 1;
            }

            System.out.print(valor + " ");
        }

        scanner.close();
    }
}
