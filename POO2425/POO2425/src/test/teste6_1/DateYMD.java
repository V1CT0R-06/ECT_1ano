package test.teste6_1;

public class DateYMD {
    private int day, month, year;

    public DateYMD(int day, int month, int year) {
        // Aqui devias validar a data, mas para já pode ser simples:
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

