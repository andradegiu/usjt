package usjt.ListaExercicio2709;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        String sexo;
        double horasAula;
        double valorHoraAula = 30.0;
        double salarioBruto;
        double salarioLiquido;
        double somaSalariosHomens = 0;
        double somaSalariosMulheres = 0;
        int countHomens = 0;
        int countMulheres = 0;

        while (true) {
            System.out.print("Digite o código do professor (ou 99999 para sair): ");
            codigo = scanner.nextInt();

            if (codigo == 99999) {
                break;
            }

            System.out.print("Digite o sexo do professor (M/F): ");
            sexo = scanner.next();

            System.out.print("Digite o número de horas/aula dadas mensalmente: ");
            horasAula = scanner.nextDouble();

            salarioBruto = horasAula * valorHoraAula;

            if (sexo.equalsIgnoreCase("M")) {
                salarioLiquido = salarioBruto - (salarioBruto * 0.10);
                somaSalariosHomens += salarioLiquido;
                countHomens++;
            } else if (sexo.equalsIgnoreCase("F")) {
                salarioLiquido = salarioBruto - (salarioBruto * 0.05);
                somaSalariosMulheres += salarioLiquido;
                countMulheres++;
            } else {
                System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
                continue;
            }

            System.out.println("Código: " + codigo);
            System.out.println("Salário Bruto: R$" + salarioBruto);
            System.out.println("Salário Líquido: R$" + salarioLiquido);
        }

        double mediaSalariosHomens = countHomens > 0 ? somaSalariosHomens / countHomens : 0;
        double mediaSalariosMulheres = countMulheres > 0 ? somaSalariosMulheres / countMulheres : 0;

        System.out.println("\nMédia dos salários líquidos dos professores do sexo masculino: R$" + mediaSalariosHomens);
        System.out.println("Média dos salários líquidos dos professores do sexo feminino: R$" + mediaSalariosMulheres);

        scanner.close();
    }
}
