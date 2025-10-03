package aula05.ex5_2;

import java.util.Scanner;

class DataYMD {
    int ano, mes, dia;
    
    public DataYMD(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }
    
    public int getAno() { return ano; }
    public int getMes() { return mes; }
    public int getDia() { return dia; }
}

class Calendario {
    private int ano;
    private int primeiroDiaSemanaAno;
    private int[][] eventos;
    
    public Calendario(int ano, int primeiroDiaSemanaAno) {
        this.ano = ano;
        this.primeiroDiaSemanaAno = primeiroDiaSemanaAno;
        this.eventos = new int[12][];
        
        for (int i = 0; i < 12; i++) {
            this.eventos[i] = new int[diasNoMes(i + 1, ano)];
        }
    }
    
    public int getAno() { return ano; }
    public int getPrimeiroDiaSemanaAno() { return primeiroDiaSemanaAno; }
    
    public int primeiroDiaSemanaMes(int mes) {
        int dias = 0;
        for (int i = 1; i < mes; i++) {
            dias += diasNoMes(i, ano);
        }
        return (primeiroDiaSemanaAno + dias) % 7;
    }
    
    public void adicionarEvento(DataYMD data) {
        eventos[data.getMes() - 1][data.getDia() - 1]++;
    }
    
    public void removerEvento(DataYMD data) {
        if (eventos[data.getMes() - 1][data.getDia() - 1] > 0) {
            eventos[data.getMes() - 1][data.getDia() - 1]--;
        }
    }
    
    public void imprimirMes(int mes) {
        System.out.println("\n" + getNomeMes(mes) + " " + ano);
        System.out.println("Do Se Te Qa Qi Se Sá");
        
        int diaInicio = primeiroDiaSemanaMes(mes);
        for (int i = 0; i < diaInicio; i++) {
            System.out.print("   ");
        }
        
        for (int dia = 1; dia <= diasNoMes(mes, ano); dia++) {
            if (eventos[mes - 1][dia - 1] > 0) {
                System.out.printf(" *%d", dia);
            } else {
                System.out.printf(" %2d", dia);
            }
            
            if ((diaInicio + dia) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
    
    public void imprimirCalendario() {
        for (int i = 1; i <= 12; i++) {
            imprimirMes(i);
        }
    }
    
    private int diasNoMes(int mes, int ano) {
        return switch (mes) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> (anoBissexto(ano) ? 29 : 28);
            default -> 31;
        };
    }
    
    private boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
    private String getNomeMes(int mes) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[mes - 1];
    }
}

public class TesteCalendario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendario calendario = null;
        
        while (true) {
            System.out.println("\nOperações do calendário:");
            System.out.println("1 - criar novo calendário");
            System.out.println("2 - imprimir mês do calendário");
            System.out.println("3 - imprimir calendário");
            System.out.println("0 - sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            
            if (opcao == 0) break;
            
            switch (opcao) {
                case 1:
                    System.out.print("Introduza o ano: ");
                    int ano = scanner.nextInt();
                    System.out.print("Introduza o primeiro dia da semana (1-Domingo, 7-Sábado): ");
                    int primeiroDiaSemana = scanner.nextInt() % 7;
                    calendario = new Calendario(ano, primeiroDiaSemana);
                    break;
                case 2:
                    if (calendario == null) {
                        System.out.println("Crie um calendário primeiro");
                        break;
                    }
                    System.out.print("Introduza o mês (1-12): ");
                    int mes = scanner.nextInt();
                    calendario.imprimirMes(mes);
                    break;
                case 3:
                    if (calendario == null) {
                        System.out.println("Crie um calendário primeiro");
                        break;
                    }
                    calendario.imprimirCalendario();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}
