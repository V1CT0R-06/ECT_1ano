package aula02;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String input = scanner.nextLine();

        System.out.println("Números na string: " + countDigits(input));
        System.out.println("Espaços na string: " + countSpaces(input));
        System.out.println("Só contém minúsculas? " + isLowerCase(input));
        System.out.println("Sem espaços extras: " + removeExtraSpaces(input));

        scanner.close();
    }

    public static int countDigits(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) count++;
        }
        return count;
    }

    public static int countSpaces(String s) {
        return s.length() - s.replace(" ", "").length();
    }

    public static boolean isLowerCase(String s) {
        return s.equals(s.toLowerCase());
    }

    public static String removeExtraSpaces(String s) {
        return s.replaceAll("\\s+", " ");
    }
}

