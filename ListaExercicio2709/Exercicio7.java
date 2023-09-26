package usjt.ListaExercicio2709;

public class Exercicio7 {
    public static void main(String[] args) {
        int termos = 8;
        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.print(primeiroTermo + " - " + segundoTermo);

        for (int i = 2; i < termos; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(" - " + proximoTermo);

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
