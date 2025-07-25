package aula07.ex7_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Galeria galeria = new Galeria();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1. Adicionar quadro");
            System.out.println("2. Adicionar escultura");
            System.out.println("3. Adicionar obra digital");
            System.out.println("4. Listar obras disponíveis");
            System.out.println("5. Vender obra");
            System.out.println("6. Mostrar lucro");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    sc.nextLine(); // limpar buffer
                    System.out.print("Nome: ");
                    String nomeQ = sc.nextLine();
                    System.out.print("Autor: ");
                    String autorQ = sc.nextLine();
                    System.out.print("Preço base: ");
                    double precoQ = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Tinta: ");
                    String tinta = sc.nextLine();
                    System.out.print("Tem moldura? (true/false): ");
                    boolean moldura = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("Tamanho (S/M/L/XL): ");
                    String tamanho = sc.nextLine();
                    galeria.adicionarObra(new Quadro(nomeQ, autorQ, precoQ, tinta, moldura, tamanho));
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nomeE = sc.nextLine();
                    System.out.print("Autor: ");
                    String autorE = sc.nextLine();
                    System.out.print("Preço base: ");
                    double precoE = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Material: ");
                    String material = sc.nextLine();
                    System.out.print("É única? (true/false): ");
                    boolean unica = sc.nextBoolean();
                    System.out.print("Nº cópias: ");
                    int copias = sc.nextInt();
                    galeria.adicionarObra(new Escultura(nomeE, autorE, precoE, material, unica, copias));
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nomeD = sc.nextLine();
                    System.out.print("Autor: ");
                    String autorD = sc.nextLine();
                    System.out.print("Preço base: ");
                    double precoD = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Blockchain: ");
                    String blockchain = sc.nextLine();
                    System.out.print("Endereço NFT: ");
                    String endereco = sc.nextLine();
                    galeria.adicionarObra(new ObraDigital(nomeD, autorD, precoD, blockchain, endereco));
                    break;
                case 4:
                    galeria.listarObrasDisponiveis();
                    break;
                case 5:
                    System.out.print("ID da obra: ");
                    int id = sc.nextInt();
                    System.out.print("Preço de venda: ");
                    double venda = sc.nextDouble();
                    galeria.venderObra(id, venda);
                    break;
                case 6:
                    galeria.mostrarLucro();
                    break;
            }

        } while (opcao != 0);
    
    sc.close();
    }
}

