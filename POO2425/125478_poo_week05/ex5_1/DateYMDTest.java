package aula05.ex5_1;

import java.util.Scanner;

class DateYMD {
    private int day, month, year;

    public DateYMD(int day, int month, int year) {
        if (valid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Data inválida! Usando data padrão 1-1-2000.");
            this.day = 1;
            this.month = 1;
            this.year = 2000;
        }
    }

    // Verifica se o mês é válido (1-12)
    public static boolean validMonth(int month) {
        return month >= 1 && month <= 12;
    }

    public static int monthDays(int month, int year) {
        if (!validMonth(month)) return 0;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && leapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Verifica se o ano é bissexto
    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean valid(int day, int month, int year) {
        return validMonth(month) && day >= 1 && day <= monthDays(month, year);
    }

    public void showDate() {
        System.out.println(year + "-" + month + "-" + day);
    }

    public void increment() {
        if (day < monthDays(month, year)) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
    }

    public void decrement() {
        if (day > 1) {
            day--;
        } else {
            if (month > 1) {
                month--;
            } else {
                month = 12;
                year--;
            }
            day = monthDays(month, year);
        }
    }
}

public class DateYMDTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateYMD date = null;

        while (true) {
            System.out.println("\n1 - Create new date");
            System.out.println("2 - Show date");
            System.out.println("3 - Increment date");
            System.out.println("4 - Decrement date");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter day, month, year: ");
                    int day = scanner.nextInt();
                    int month = scanner.nextInt();
                    int year = scanner.nextInt();
                    date = new DateYMD(day, month, year);
                    break;
                case 2:
                    if (date != null) date.showDate();
                    else System.out.println("No date set!");
                    break;
                case 3:
                    if (date != null) date.increment();
                    else System.out.println("No date set!");
                    break;
                case 4:
                    if (date != null) date.decrement();
                    else System.out.println("No date set!");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
