package MT1_POO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class parte1 {
    static int v1;
    static List<Integer> v2 = new ArrayList<>();
    static String v3;
    static List<String> v4 = new ArrayList<>();

    public static void main(String[] args) {

        // lerTeclado(); 
        lerFicheiro();  

        imprimir();
    }

    public static void lerTeclado() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            String tipo = sc.nextLine();
            String valor = sc.nextLine();

            switch (tipo) {
                case "INT":
                    v1 = Integer.parseInt(valor);
                    break;
                case "LISTINT":
                    v2 = parseListInt(valor);
                    break;
                case "STRING":
                    v3 = valor;
                    break;
                case "LISTSTRING":
                    v4 = parseListString(valor);
                    break;
                default:
                    System.out.println("Tipo desconhecido: " + tipo);
            }
        }
        sc.close();
    }

    public static void lerFicheiro() {
        try {
            Scanner sc = new Scanner(new File("inputs.txt"));
            for (int i = 0; i < 4; i++) {
                if (!sc.hasNextLine()) break;
                String tipo = sc.nextLine();
                if (!sc.hasNextLine()) break;
                String valor = sc.nextLine();

                switch (tipo) {
                    case "INT":
                        v1 = Integer.parseInt(valor);
                        break;
                    case "LISTINT":
                        v2 = parseListInt(valor);
                        break;
                    case "STRING":
                        v3 = valor;
                        break;
                    case "LISTSTRING":
                        v4 = parseListString(valor);
                        break;
                    default:
                        System.out.println("Tipo desconhecido: " + tipo);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado.");
        }
    }

    public static void imprimir() {
        System.out.println("INT");
        System.out.println(v1);
        System.out.println("LISTINT");
        for (int num : v2) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("STRING");
        System.out.println(v3);
        System.out.println("LISTSTRING");
        for (String s : v4) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static List<Integer> parseListInt(String input) {
        List<Integer> list = new ArrayList<>();
        String[] parts = input.trim().split("\\s+");
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        return list;
    }

    private static List<String> parseListString(String input) {
        List<String> list = new ArrayList<>();
        String[] parts = input.trim().split("\\s+");
        list.addAll(Arrays.asList(parts));
        return list;
    }
}
