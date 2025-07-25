package aula07.ex7_2;

// Classe abstrata que define o que toda data deve saber fazer
public abstract class Date {
    public abstract void setDate(int dia, int mes, int ano);
    public abstract int getDay();
    public abstract int getMonth();
    public abstract int getYear();
    public abstract String toString();

    // Verifica se uma data é válida
    public static boolean isValidDate(int day, int month, int year) {
        if (year < 0) return false;
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > daysInMonth(month, year)) return false;
        return true;
    }

    // Devolve o número de dias num mês
    public static int daysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11: return 30;
            case 2: return (isLeapYear(year)) ? 29 : 28;
            default: return 31;
        }
    }

    // Verifica se o ano é bissexto
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}
