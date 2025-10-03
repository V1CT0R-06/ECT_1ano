package aula07.ex7_1;

import java.util.*;

public class TestarFormas {
    public static void main(String[] args) {
        List<Forma> lista = new ArrayList<>();
        lista.add(new Circulo("vermelho", 5));
        lista.add(new Triangulo("azul", 3, 4, 5));
        lista.add(new Retangulo("verde", 2, 6));
        lista.add(new Circulo("azul", 5)); // mesma medida, cor diferente

        for (Forma f : lista) {
            System.out.println(f);
            System.out.println("Área: " + f.getArea());
            System.out.println("Perímetro: " + f.getPerimetro());
            System.out.println();
        }

        // Testa igualdade
        Forma f1 = new Circulo("azul", 5);
        Forma f2 = new Circulo("vermelho", 5);
        System.out.println("f1 == f2? " + f1.equals(f2)); // deve dar false
    }
}
