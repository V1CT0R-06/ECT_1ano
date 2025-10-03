package aula03;

import java.util.ArrayList;
import java.util.List;
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
        List<double[]> notas = new ArrayList<>(); 
        
        System.out.println("Digite as notas (teórica e prática) separadas por espaço (ou 'fim' para terminar):");

        while (scanner.hasNextDouble()) {
            double notaT = scanner.nextDouble();
            double notaP = scanner.nextDouble();
            notas.add(new double[]{notaT, notaP});
        }

        System.out.println("\nNotaT  NotaP  Pauta");
        
        for (double[] nota : notas) {
            double notaT = nota[0];
            double notaP = nota[1];
            int pauta = calcularNotaFinal(notaT, notaP);
            System.out.printf("%.1f  %.1f  %d%n", notaT, notaP, pauta);
        }

        scanner.close();
    }
}
