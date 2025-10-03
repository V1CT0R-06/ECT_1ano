package MT1_POO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parte1 {
    // -----------------------------------------------------
    //          !!! Não alterar este código !!!
    // -----------------------------------------------------
    private static int v1;
    private static List<Integer> v2 = new ArrayList<>();
    private static String v3;
    private static List<String> v4 = new ArrayList<>();
    // -----------------------------------------------------

    public static void lerTeclado() {
        Scanner sc = new Scanner(System.in);

        v1 = sc.nextInt();
        sc.nextLine(); 

        String[] numeros = sc.nextLine().split(" ");
        for (String num : numeros) {
            v2.add(Integer.parseInt(num));
        }

        v3 = sc.nextLine();

        String[] palavras = sc.nextLine().split(" ");
        for (String palavra : palavras) {
            v4.add(palavra);
        }

        sc.close();
    }

    public static void lerFicheiro() {
        try {
            List<String> linhas = Files.readAllLines(Paths.get("inputs.txt"));

            v1 = Integer.parseInt(linhas.get(0));

            String[] numeros = linhas.get(1).split(" ");
            for (String num : numeros) {
                v2.add(Integer.parseInt(num));
            }

            v3 = linhas.get(2);

            String[] palavras = linhas.get(3).split(" ");
            for (String palavra : palavras) {
                v4.add(palavra);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }

    public static void imprimir() {
        System.out.println(v1);

        for (int num : v2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(v3);

        for (String palavra : v4) {
            System.out.print(palavra + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // -----------------------------------------------------------------
        // !!! Não imprimir texto a pedir determinado input, ler direto !!!
        // -----------------------------------------------------------------

        //lerTeclado();     // Para testar com input direto
        lerFicheiro();  // Para testar com ficheiro (precisas do ficheiro "dados.txt")
        imprimir();     // Descomenta para ver os dados impressos
    }
}