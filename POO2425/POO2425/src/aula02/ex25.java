package aula02;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String input = scanner.nextLine();

        System.out.println("Minusculas: " + input.toLowerCase());
        System.out.println("Ultimo character: " + input.charAt(input.length() - 1));
        System.out.println("Três primeiros character: " + input.substring(0, 3));
        
        System.out.println("Tamanho: " + input.length());
        System.out.println("Maiusculas: " + input.toUpperCase());
        System.out.println("Sem espaços: " + input.replace(" ", ""));

        scanner.close();
    }
}
