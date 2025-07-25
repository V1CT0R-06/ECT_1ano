package MT2_POO;

import java.io.*;
import java.util.*;

public class Main {
    private static List<Parcel> parcels = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // Add some parcels manually
        parcels.add(new Parcel("Aveiro, Portugal", "Madrid, Spain", 10));
        parcels.add(new Parcel("Dublin, Ireland", "Berlin, Germany", 15));

        // Print and calculate
        printAll();

        System.out.println("\nBy ID:");
        System.out.println(getParcel(1));
        System.out.println("Cost: €" + calcCost(getParcel(1)));
        System.out.println(getParcel(2));
        System.out.println("Cost: €" + calcCost(getParcel(2)));

        // Read from file
        readFile("src/MT2_POO/encomendas.txt");
        System.out.println("\nAfter reading file:");
        printAll();

        // Write to output file
        writeFile("src/MT2_POO/resultado.txt");
    }

    static Parcel getParcel(int id) {
        for (Parcel p : parcels) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    static double calcCost(Parcel p) {
        double w = p.getWeight();
        if (w <= 5) return w * 1.0;
        else if (w <= 10) return w * 0.75;
        else return w * 0.5;
    }

    static void printAll() {
        for (Parcel p : parcels) {
            System.out.printf("%s | Cost: €%.2f%n", p, calcCost(p));
        }
    }

    static void readFile(String filename) throws Exception {
        Scanner sc = new Scanner(new File(filename));
        sc.nextLine(); // skip header
        while (sc.hasNextLine()) {
            String[] parts = sc.nextLine().split(";");
            double weight = Double.parseDouble(parts[1].trim());
            String from = parts[2].trim();
            String to = parts[3].trim();
            parcels.add(new Parcel(from, to, weight));
        }
        sc.close();
    }

    static void writeFile(String filename) throws Exception {
        PrintWriter pw = new PrintWriter(filename);
        for (Parcel p : parcels) {
            pw.printf("%s;%s;%.2f;%.2f%n",
                p.getFrom(), p.getTo(), p.getWeight(), calcCost(p));
        }
        pw.close();
    }
}
