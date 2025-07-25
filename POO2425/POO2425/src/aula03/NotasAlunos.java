package aula03;

import java.util.*;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos alunos?");
        int numAlunos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numAlunos; i++) { // se o valor de numAlunos for menor que 1 não entra no "loop"
            System.out.println("Nome do aluno:");
            String nome = scanner.nextLine();

            System.out.println("Nota Teórica:");
            double notaT = scanner.nextDouble();

            System.out.println("Nota Prática:");
            double notaP = scanner.nextDouble();

            int notaFinal = calcularNota(notaT, notaP);

            System.out.println("NotaT\tNotaP\tPauta");
            System.out.println(notaT + "\t" + notaP + "\t" + notaFinal);

            if (notaFinal != 66) {
                System.out.println(nome + " aprovado.");
            } else {
                System.out.println(nome + " reprovado.");
            }
        }
        scanner.close();
    }

    private static int calcularNota(double notaT, double notaP) {
        if (notaT < 7.0 || notaP < 7.0) {
            return 66;
        }
        return (int) Math.round(0.4 * notaT + 0.6 * notaP);
    }
}
