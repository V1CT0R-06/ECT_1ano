package aula02;

import java.util.ArrayList;
import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        System.out.print("Digite um número: ");
        double firstNumber = scanner.nextDouble();
        numbers.add(firstNumber);

        double sum = firstNumber, max = firstNumber, min = firstNumber;

        while (true) {
            System.out.print("Digite um número: ");
            double num = scanner.nextDouble();
            if (num == firstNumber) break;
            
            numbers.add(num);
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Média: " + (sum / numbers.size()));
        System.out.println("Total de números lidos: " + numbers.size());
        System.out.println("Números lidos: " + numbers);
        System.out.println("Números lidos (sem repetição): " + new ArrayList<>(numbers));
        scanner.close();
    }
}

