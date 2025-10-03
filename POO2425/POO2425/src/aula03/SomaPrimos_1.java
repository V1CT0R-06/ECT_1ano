package aula03;

import java.util.Scanner;

public class SomaPrimos_1 {
    
    public static boolean ehPrimo(int num) {
        if (num < 2) return false; 
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false; 
        }
        return true; // Se não encontrou divisores, é primo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0); 
        
        int soma = 0;
        for (int i = 2; i <= numero; i++) {
            if (ehPrimo(i)) {
                soma += i;
            }
        }

        System.out.println("A soma dos números primos até " + numero + " é: " + soma);
        scanner.close();
    }
}
