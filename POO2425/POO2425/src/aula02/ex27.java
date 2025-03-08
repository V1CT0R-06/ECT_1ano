package aula02;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza uma frase: ");
        String input = scanner.nextLine();
        
        scanner.close();

        StringBuilder acronym = new StringBuilder();
        for (String word : input.split("\\s+")) {
            if (word.length() >= 3) acronym.append(word.charAt(0));
        }

        System.out.println("Acrónimo: " + acronym.toString().toUpperCase());
    }
}
