package aula05.ex5_all;

import java.util.ArrayList;

public class Agency {
    private ArrayList<Property> properties;

    public Agency() {
        properties = new ArrayList<>();
    }

    public void addProperty(Property p) {
        properties.add(p);
    }

    public void sellProperty(int id) {
        Property p = findProperty(id);
        if (p == null) {
            System.out.println("Imóvel " + id + " não existe.");
        } else if (!p.isAvailable()) {
            System.out.println("Imóvel " + id + " não está disponível.");
        } else {
            p.sell();
            System.out.println("Imóvel " + id + " vendido.");
        }
    }

    public void listProperties() {
        System.out.println("Propriedades:");
        for (Property p : properties) {
            System.out.println(p);
        }
    }

    public void startAuction(int id, DateYMD start, DateYMD end) {
        Property p = findProperty(id);
        if (p != null) {
            p.startAuction(start, end);
        }
    }

    private Property findProperty(int id) {
        for (Property p : properties) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
