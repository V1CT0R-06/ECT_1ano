package aula03;

import java.util.Scanner;
import java.util.Random;

public class JogoAltoBaixo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do{
            int numero = random.nextInt(100) + 1;
            int tentativas = 0;

            System.out.println("Adivinhe o número entre 1 e 100");

            while(true){
                int palpite = scanner.nextInt();
                tentativas++;

                if(palpite == numero){
                    System.out.println("Você acertou em " + tentativas + " tentativas.");
                    break;
                } else if(palpite < numero){
                    System.out.println("Muito baixo. Tente novamente.");
                } else {
                    System.out.println("Muito alto. Tente novamente.");
                }
            }
            System.out.println("Deseja jogar novamente? (s/n)");
        } while(scanner.next().equals("s"));

        scanner.close();
    }
}

