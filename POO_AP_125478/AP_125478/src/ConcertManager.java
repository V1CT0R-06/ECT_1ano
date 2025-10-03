import java.time.Month;
import java.util.*;

public class ConcertManager {
    private Map<Integer, Concert> concerts = new HashMap<>();
    private IConcertProfitCalculator profitCalculator = new StandardConcertProfitCalculator();

    public void addConcert(Concert concert) {
        concerts.put(concert.getId(), concert);
    }

    public void removeConcert(int id) {
        concerts.remove(id);
    }

    public Concert getConcert(int id) {
        return concerts.get(id);
    }

    public double calculateConcertProfit(int id) {
        Concert concert = concerts.get(id);
        return concert != null ? profitCalculator.calculateConcertProfit(concert) : -1;
    }

    public void printAllConcerts() {
        if (concerts.isEmpty()) {
            System.out.println("No concerts available.");
            return;
        }
        concerts.values().forEach(System.out::println);
    }

    public void sortConcertsByProfit() {
        Map<Month, List<Concert>> concertsByMonth = new TreeMap<>();

        for (Concert concert : concerts.values()) {
            Month month = concert.getStartDateTime().getMonth();
            concertsByMonth.computeIfAbsent(month, m -> new ArrayList<>()).add(concert);
        }

        for (Month month : concertsByMonth.keySet()) {
            System.out.println("\n--- " + month + " ---");
            concertsByMonth.get(month).stream()
                .sorted(Comparator.comparingDouble(profitCalculator::calculateConcertProfit).reversed())
                .forEach(System.out::println);
        }
    }
}