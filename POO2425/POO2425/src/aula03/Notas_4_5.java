package aula03;

import java.util.Scanner;

public class Notas_4_5 {

    public static int calcularNotaFinal(double notaT, double notaP) {
        if (notaT < 7.0 || notaP < 7.0) {
            return 66; // Reprovado
        }
        return (int) Math.round(0.4 * notaT + 0.6 * notaP); // Arredondar a nota
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as notas (teórica e prática) separadas por espaço (ou 'fim' para terminar):");
        
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double notaT = scanner.nextDouble();
                double notaP = scanner.nextDouble();
                int pauta = calcularNotaFinal(notaT, notaP);
                System.out.println("\nNotaT  NotaP  Pauta");
                System.out.printf("%.1f  %.1f  %d%n", notaT, notaP, pauta);
            } else if (scanner.next().equalsIgnoreCase("fim")) {
                break;
            }
        }

        scanner.close();
    }
}
