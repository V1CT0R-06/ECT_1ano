package aula07.ex7_2;

import java.time.LocalDate;
import java.time.Period;

// Guarda a data como número de dias desde 1 de janeiro de 2000
public class DateND extends Date {
    private static final LocalDate BASE = LocalDate.of(2000, 1, 1);
    private int diasDesde2000;

    public DateND(int dia, int mes, int ano) {
        setDate(dia, mes, ano);
    }

    public DateND() {
        this(LocalDate.now().getDayOfMonth(),
             LocalDate.now().getMonthValue(),
             LocalDate.now().getYear());
    }

    @Override
    public void setDate(int dia, int mes, int ano) {
        LocalDate data = LocalDate.of(ano, mes, dia);
        Period period = Period.between(BASE, data);
        diasDesde2000 = period.getDays() + period.getMonths() * 30 + period.getYears() * 365;
    }

    private LocalDate getData() {
        return BASE.plusDays(diasDesde2000);
    }

    @Override public int getDay()   { return getData().getDayOfMonth(); }
    @Override public int getMonth() { return getData().getMonthValue(); }
    @Override public int getYear()  { return getData().getYear(); }

    @Override
    public String toString() {
        return getData().toString(); // yyyy-MM-dd
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DateND)) return false;
        DateND outra = (DateND) obj;
        return diasDesde2000 == outra.diasDesde2000;
    }
}
