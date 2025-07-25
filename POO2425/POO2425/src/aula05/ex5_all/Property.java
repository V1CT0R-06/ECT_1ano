package aula05.ex5_all;

public class Property {
    private static int nextId = 1000;

    private int id;
    private int rooms;
    private String location;
    private int price;
    private boolean available;
    private DateYMD startAuction;
    private DateYMD endAuction;

    public Property(int rooms, String location, int price) {
        this.id = nextId++;
        this.rooms = rooms;
        this.location = location;
        this.price = price;
        this.available = true;
        this.startAuction = null;
        this.endAuction = null;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void sell() {
        available = false;
    }

    public void startAuction(DateYMD start, DateYMD end) {
        this.startAuction = start;
        this.endAuction = end;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Imóvel: ").append(id)
          .append("; quartos: ").append(rooms)
          .append("; localidade: ").append(location)
          .append("; preço: ").append(price)
          .append("; disponível: ").append(available ? "sim" : "não");
        if (startAuction != null && endAuction != null) {
            sb.append("; leilão ").append(startAuction).append(" : ").append(endAuction);
        }
        return sb.toString();
    }
}
