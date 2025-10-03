package aula05.ex5_all;

public class Ex3 {
    public static void main(String[] args) {
        Agency agency = new Agency();

        agency.addProperty(new Property(2, "Glória", 30000));
        agency.addProperty(new Property(1, "Vera Cruz", 25000));
        agency.addProperty(new Property(3, "Santa Joana", 32000));
        agency.addProperty(new Property(2, "Aradas", 24000));
        agency.addProperty(new Property(2, "São Bernardo", 20000));

        agency.sellProperty(1001);
        agency.sellProperty(1001);
        agency.sellProperty(1010);

        agency.startAuction(1002, new DateYMD(24, 3, 2023), new DateYMD(24, 3, 2023));
        agency.startAuction(1003, new DateYMD(3, 4, 2023), new DateYMD(3, 4, 2023));

        agency.listProperties();
    }
}

