package aula05.ex5_all;

public class Calendar {
    private int year;
    private int firstWeekday;
    private int[][] events; // [mes][dia]

    public Calendar(int year, int firstWeekday) {
        if (firstWeekday < 1 || firstWeekday > 7)
            throw new IllegalArgumentException("Dia da semana inválido.");

        this.year = year;
        this.firstWeekday = firstWeekday;
        this.events = new int[12][]; // meses de 0 a 11

        for (int m = 0; m < 12; m++) {
            int days = DateYMD.monthDays(m + 1, year);
            this.events[m] = new int[days];
        }
    }

    public int year() {
        return year;
    }

    public int firstWeekdayOfYear() {
        return firstWeekday;
    }

    public int firstWeekdayOfMonth(int month) {
        if (!DateYMD.validMonth(month)) return -1;

        int weekday = firstWeekday;
        for (int m = 1; m < month; m++) {
            weekday = (weekday + DateYMD.monthDays(m, year)) % 7;
            if (weekday == 0) weekday = 7;
        }
        return weekday;
    }

    public void addEvent(DateYMD date) {
        if (date.getYear() != year || !DateYMD.valid(date.getDay(), date.getMonth(), date.getYear()))
            return;
        events[date.getMonth() - 1][date.getDay() - 1]++;
    }

    public void removeEvent(DateYMD date) {
        if (date.getYear() != year || !DateYMD.valid(date.getDay(), date.getMonth(), date.getYear()))
            return;
        if (events[date.getMonth() - 1][date.getDay() - 1] > 0)
            events[date.getMonth() - 1][date.getDay() - 1]--;
    }

    public String printMonth(int month) {
        if (!DateYMD.validMonth(month)) return "Mês inválido.";
        String[] names = {"January", "February", "March", "April", "May", "June",
                          "July", "August", "September", "October", "November", "December"};
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("     %s %d\n", names[month - 1], year));
        sb.append(" Su Mo Tu We Th Fr Sa\n");

        int firstDay = firstWeekdayOfMonth(month);
        int daysInMonth = DateYMD.monthDays(month, year);
        // Removed unused variable 'current'

        // espaço inicial
        for (int i = 1; i < firstDay; i++) sb.append("   ");

        for (int d = 1; d <= daysInMonth; d++) {
            boolean hasEvent = events[month - 1][d - 1] > 0;
            sb.append(hasEvent ? "*" : " ");
            sb.append(String.format("%2d", d));
            if ((firstDay + d - 1) % 7 == 0) sb.append("\n");
            else sb.append(" ");
        }
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int m = 1; m <= 12; m++) {
            sb.append(printMonth(m)).append("\n");
        }
        return sb.toString();
    }
}

