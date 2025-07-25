package aula07.ex7_2;

public class DateYMD extends Date {
    private int day, month, year;

    public DateYMD(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            throw new IllegalArgumentException("Data inválida");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public void setDate(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            throw new IllegalArgumentException("Data inválida");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int getDay() {
        return day;
    }

    @Override
    public int getMonth() {
        return month;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DateYMD)) return false;
        DateYMD other = (DateYMD) obj;
        return day == other.day && month == other.month && year == other.year;
    }
}
