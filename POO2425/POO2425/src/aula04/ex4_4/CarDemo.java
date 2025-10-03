package aula04.ex4_4;

import java.util.Scanner;

class Car {
    String marca, modelo;
    int ano, quilometragem;

    public Car(String marca, String modelo, int ano, int quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public void adicionarViagem(int distancia) {
        if (distancia > 0) {
            this.quilometragem += distancia;
        }
    }

    public String toString() {
        return marca + " " + modelo + ", " + ano + ", kms: " + quilometragem;
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] carros = new Car[10];
        int count = 0;

        System.out.println("Insira dados do carro (marca modelo ano quilómetros):");
        while (count < 10) {
            String entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) break;
            
            String[] partes = entrada.split(" ", 4);
            if (partes.length == 4) {
                try {
                    carros[count] = new Car(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]));
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Dados mal formatados. Tente novamente.");
                }
            } else {
                System.out.println("Dados mal formatados. Tente novamente.");
            }
        }

        System.out.println("Carros registados:");
        for (int i = 0; i < count; i++) {
            System.out.println(carros[i]);
        }

        System.out.println("Registe uma viagem no formato 'marca:distância':");
        while (true) {
            String viagem = scanner.nextLine().trim();
            if (viagem.isEmpty()) break;
            
            String[] partes = viagem.split(":");
            if (partes.length == 2) {
                try {
                    String marca = partes[0];
                    int distancia = Integer.parseInt(partes[1]);
                    boolean encontrado = false;
                    
                    for (int i = 0; i < count; i++) {
                        if (carros[i].marca.equalsIgnoreCase(marca)) {
                            carros[i].adicionarViagem(distancia);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Carro não encontrado.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Dados mal formatados. Tente novamente.");
                }
            } else {
                System.out.println("Dados mal formatados. Tente novamente.");
            }
        }

        System.out.println("Carros registados após viagens:");
        for (int i = 0; i < count; i++) {
            System.out.println(carros[i]);
        }
        scanner.close();
    }
}
