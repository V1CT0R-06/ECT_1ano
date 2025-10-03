package aula04.ex4_3;

import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        this.kms += distance; 
    }

    public String toString() {
        return String.format("%s %s, %d, kms: %d", make, model, year, kms);
    }
}

public class SimpleCarDemo {

    static Scanner sc = new Scanner(System.in);

    static void listCars(Car[] cars, int count) {
        System.out.println("Carros registados:");
        for (int i = 0; i < count; i++) {
            System.out.println(cars[i]);
        }
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10]; 
        int count = 0;

        System.out.println("Insira dados do carro (marca modelo ano quilómetros):");
        while (count < 10) {
            String input = sc.nextLine().trim();
            if (input.isEmpty()) break;
            
            String[] parts = input.split(" ", 4);
            if (parts.length == 4) {
                try {
                    cars[count] = new Car(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Dados mal formatados. Tente novamente.");
                }
            } else {
                System.out.println("Dados mal formatados. Tente novamente.");
            }
        }

        listCars(cars, count);

        System.out.println("Registe uma viagem no formato 'carro:distância':");
        while (true) {
            String viagem = sc.nextLine().trim();
            if (viagem.isEmpty()) break;
            
            String[] partes = viagem.split(":");
            if (partes.length == 2) {
                try {
                    int carIndex = Integer.parseInt(partes[0]);
                    int distancia = Integer.parseInt(partes[1]);
                    if (carIndex >= 0 && carIndex < count && distancia > 0) {
                        cars[carIndex].drive(distancia);
                    } else {
                        System.out.println("Dados mal formatados. Tente novamente.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Dados mal formatados. Tente novamente.");
                }
            } else {
                System.out.println("Dados mal formatados. Tente novamente.");
            }
        }

        listCars(cars, count);

        sc.close();
    }
}