package MT2_POO;

public class Parcel {
    private static int nextId = 1;
    private int id;
    private String from;
    private String to;
    private double weight;

    public Parcel(String from, String to, double weight) {
        this.id = nextId++;
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Parcel " + id + ": " + from + " → " + to + " (" + weight + " kg)";
    }
}
