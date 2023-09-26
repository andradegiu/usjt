package usjt.ListaExercicio2709;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, candidatosFemininos = 0, candidatosMasculinos = 0;
        int homensComExperiencia = 0, idadeTotalHomens = 0, homensMais45 = 0;
        int mulheresMenos21ComExperiencia = 0, menorIdadeMulherComExperiencia = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Informe a idade (ou 0 para encerrar): ");
            idade = scanner.nextInt();

            if (idade == 0) {
                break;
            }

            System.out.print("Informe o sexo (M ou F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Experiência no serviço (S ou N): ");
            char experiencia = scanner.next().charAt(0);

            if (sexo == 'M') {
                candidatosMasculinos++;
                if (experiencia == 'S') {
                    homensComExperiencia++;
                    idadeTotalHomens += idade;
                    if (idade > 45) {
                        homensMais45++;
                    }
                }
            } else if (sexo == 'F') {
                candidatosFemininos++;
                if (idade < 21 && experiencia == 'S') {
                    mulheresMenos21ComExperiencia++;
                }
                if (experiencia == 'S' && idade < menorIdadeMulherComExperiencia) {
                    menorIdadeMulherComExperiencia = idade;
                }
            }
        }

        System.out.println("Número de candidatos do sexo feminino: " + candidatosFemininos);
        System.out.println("Número de candidatos do sexo masculino: " + candidatosMasculinos);

        if (homensComExperiencia > 0) {
            double idadeMediaHomensComExperiencia = (double) idadeTotalHomens / homensComExperiencia;
            System.out.println("Idade média dos homens com experiência: " + idadeMediaHomensComExperiencia);
        } else {
            System.out.println("Não há homens com experiência.");
        }

        if (candidatosMasculinos > 0) {
            double percentagemHomensMais45 = (double) homensMais45 / candidatosMasculinos * 100;
            System.out.println("Percentagem de homens com mais de 45 anos: " + percentagemHomensMais45 + "%");
        } else {
            System.out.println("Não há candidatos do sexo masculino.");
        }

        System.out.println("Número de mulheres com menos de 21 anos e experiência: " + mulheresMenos21ComExperiencia);

        if (menorIdadeMulherComExperiencia != Integer.MAX_VALUE) {
            System.out.println("Menor idade entre mulheres com experiência: " + menorIdadeMulherComExperiencia);
        } else {
            System.out.println("Não há mulheres com experiência.");
        }
        scanner.close();
    }
}


