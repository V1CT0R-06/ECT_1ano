package aula06.ex6_2;

import java.util.ArrayList;
import java.util.Scanner;

class DateYMD {
    int dia, mes, ano;

    DateYMD(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

class Pessoa {
    String nome;
    int cartaoCidadao;
    DateYMD nascimento;

    Pessoa(String nome, int cartaoCidadao, DateYMD nascimento) {
        if (nome == null || nome.isEmpty() || cartaoCidadao <= 0 || nascimento == null) {
            throw new IllegalArgumentException("Argumentos inválidos para criar Pessoa");
        }
        this.nome = nome;
        this.cartaoCidadao = cartaoCidadao;
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return nome + "; CC: " + cartaoCidadao + "; Data de Nascimento: " + nascimento;
    }
}



public class GestaoContactos {
    private ArrayList<Contacto> contactos = new ArrayList<>();

    public void inserirContacto(Pessoa pessoa, String telemovel, String email) {
        Contacto contacto = new Contacto(pessoa, telemovel, email);
        contactos.add(contacto);
        System.out.println("Contacto inserido com sucesso: " + contacto);
    }

    public void alterarContacto(int id, String telemovel, String email) {
        for (Contacto contacto : contactos) {
            if (contacto.getId() == id) {
                if (telemovel != null && !telemovel.isEmpty()) {
                    contacto.setTelemovel(telemovel);
                }
                if (email != null && !email.isEmpty()) {
                    contacto.setEmail(email);
                }
                System.out.println("Contacto alterado com sucesso: " + contacto);
                return;
            }
        }
        System.out.println("Contacto com ID " + id + " não encontrado.");
    }

    public void apagarContacto(int id) {
        if (contactos.removeIf(contacto -> contacto.getId() == id)) {
            System.out.println("Contacto com ID " + id + " apagado com sucesso.");
        } else {
            System.out.println("Contacto com ID " + id + " não encontrado.");
        }
    }

    public void procurarContacto(String termo) {
        for (Contacto contacto : contactos) {
            if (contacto.getPessoa().nome.contains(termo) || String.valueOf(contacto.getPessoa().cartaoCidadao).contains(termo)) {
                System.out.println(contacto);
            }
        }
    }

    public void listarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Inserir contacto");
            System.out.println("2. Alterar contacto");
            System.out.println("3. Apagar contacto");
            System.out.println("4. Procurar contacto");
            System.out.println("5. Listar contactos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Cartão de Cidadão: ");
                    int cc = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Data de Nascimento (dia mes ano): ");
                    int dia = scanner.nextInt();
                    int mes = scanner.nextInt();
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    DateYMD nascimento = new DateYMD(dia, mes, ano);
                    Pessoa pessoa = new Pessoa(nome, cc, nascimento);
                    System.out.print("Telemóvel: ");
                    String telemovel = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    inserirContacto(pessoa, telemovel, email);
                    break;
                case 2:
                    System.out.print("ID do contacto a alterar: ");
                    int idAlterar = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Novo Telemóvel (deixe em branco para não alterar): ");
                    String novoTelemovel = scanner.nextLine();
                    System.out.print("Novo Email (deixe em branco para não alterar): ");
                    String novoEmail = scanner.nextLine();
                    alterarContacto(idAlterar, novoTelemovel.isEmpty() ? null : novoTelemovel, novoEmail.isEmpty() ? null : novoEmail);
                    break;
                case 3:
                    System.out.print("ID do contacto a apagar: ");
                    int idApagar = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    apagarContacto(idApagar);
                    break;
                case 4:
                    System.out.print("Termo de pesquisa (nome ou CC): ");
                    String termo = scanner.nextLine();
                    procurarContacto(termo);
                    break;
                case 5:
                    listarContactos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void main(String[] args) {
        GestaoContactos gestao = new GestaoContactos();
        gestao.menu();
    }
}

