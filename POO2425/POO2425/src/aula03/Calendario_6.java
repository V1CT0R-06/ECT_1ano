package aula03;

import java.time.LocalDate;
import java.util.Scanner;

public class Calendario_6 {
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30; 
            case 2 -> isLeapYear(year) ? 29 : 28; 
            default -> 31; 
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o mês e o ano (mm/yyyy): ");
        String input = scanner.nextLine();
        String[] parts = input.split("/");

        int month = Integer.parseInt(parts[0]);
        int year = Integer.parseInt(parts[1]);

        System.out.print("Digite o dia da semana que começa o mês (1=Segunda, 7=Domingo): ");
        int startDay = scanner.nextInt();

        if (startDay < 0) {
            LocalDate today = LocalDate.now();
            month = today.getMonthValue();
            year = today.getYear();
            startDay = today.withDayOfMonth(1).getDayOfWeek().getValue();
        }

        int daysInMonth = getDaysInMonth(month, year);

        System.out.printf("\n   %s %d\n", LocalDate.of(year, month, 1).getMonth(), year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 1; i < startDay; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + startDay - 1) % 7 == 0) { 
                System.out.println();
            }
        }
        
        System.out.println();
        scanner.close();
    }
}
