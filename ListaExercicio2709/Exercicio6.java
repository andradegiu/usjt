package usjt.ListaExercicio2709;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double SALARIO_MINIMO = 450.0;

        int[] codigo = new int[10];
        int[] horasTrabalhadas = new int[10];
        char[] turno = new char[10];
        char[] categoria = new char[10];
        double[] valorHora = new double[10];
        double[] salarioInicial = new double[10];
        double[] auxilioAlimentacao = new double[10];
        double[] salarioFinal = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Funcionário " + (i + 1));

            System.out.print("Código: ");
            codigo[i] = scanner.nextInt();

            System.out.print("Horas trabalhadas: ");
            horasTrabalhadas[i] = scanner.nextInt();

            System.out.print("Turno (M/V/N): ");
            turno[i] = scanner.next().charAt(0);

            System.out.print("Categoria (G/O): ");
            categoria[i] = scanner.next().charAt(0);

            if (categoria[i] == 'G') {
                if (turno[i] == 'N') {
                    valorHora[i] = 0.18 * SALARIO_MINIMO;
                } else {
                    valorHora[i] = 0.15 * SALARIO_MINIMO;
                }
            } else {
                if (turno[i] == 'N') {
                    valorHora[i] = 0.13 * SALARIO_MINIMO;
                } else {
                    valorHora[i] = 0.10 * SALARIO_MINIMO;
                }
            }

            salarioInicial[i] = valorHora[i] * horasTrabalhadas[i];

            if (salarioInicial[i] <= 300.0) {
                auxilioAlimentacao[i] = 0.20 * salarioInicial[i];
            } else if (salarioInicial[i] <= 600.0) {
                auxilioAlimentacao[i] = 0.15 * salarioInicial[i];
            } else {
                auxilioAlimentacao[i] = 0.05 * salarioInicial[i];
            }

            salarioFinal[i] = salarioInicial[i] + auxilioAlimentacao[i];
        }
    
        System.out.println("\nCódigo | Horas Trabalhadas | Valor Hora | Salário Inicial | Auxílio-Alimentação | Salário Final");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d | %17d | %10.2f | %15.2f | %18.2f | %13.2f\n", codigo[i], horasTrabalhadas[i], valorHora[i], salarioInicial[i], auxilioAlimentacao[i], salarioFinal[i]);
        
        }
        
        scanner.close();
    }
}
