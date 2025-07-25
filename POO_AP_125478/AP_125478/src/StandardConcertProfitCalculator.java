public class StandardConcertProfitCalculator implements IConcertProfitCalculator {

    @Override
    public double calculateConcertProfit(Concert concert) {
        double hours = concert.getDurationInMinutes() / 60.0;
        double profit = 1500.0 * hours; 

        String location = concert.getLocation().toLowerCase();
        boolean ForadePortugal = !location.contains("Portugal");
        boolean ForadePeninsula = ForadePortugal &&
                !location.contains("Espanha");

        if (ForadePortugal) {
            profit *= 2;
        }

        if (ForadePeninsula) {
            profit += 800;
        }

        return profit;
    }
}