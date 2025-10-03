package aula02;

import java.util.Scanner;

public class InvestimentoJuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir valores ao usuário
        System.out.print("Montante inicial (€): ");
        double montante = scanner.nextDouble();

        System.out.print("Taxa de juros mensal (%): ");
        double taxa = scanner.nextDouble() / 100; // Converter para decimal

        // Calcular juros compostos por 3 meses (multiplicando cada mês)
        montante = montante * (1 + taxa);
        montante = montante * (1 + taxa);
        montante = montante * (1 + taxa);

        // Mostrar resultado
        System.out.printf("Valor após 3 meses: %.2f euros\n", montante);

        scanner.close();
    }
}


