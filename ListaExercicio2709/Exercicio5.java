package usjt.ListaExercicio2709;
import java.util.Scanner;

public class Exercicio5 {

public class EFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double e = 1;
        
        for (int i = 1; i <= n; i++) {
            double fatorial = 1;
            for (int j = 2; j <= i; j++) {
                fatorial *= j;
            }
            e = e + (1 / fatorial);
        }
        System.out.println(e);
        sc.close();
    }
}
}
