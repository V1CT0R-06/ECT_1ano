package aula04.ex4_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ex4_1 {
    public static void main(String[] args) {
        ArrayList<Object> shapes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1. Add Circle");
            System.out.println("2. Add Triangle");
            System.out.println("3. Add Rectangle");
            System.out.println("4. List Shapes");
            System.out.println("5. Compare Shapes");
            System.out.println("0. Exit");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shapes.add(new Circle(radius));
                    break;
                case 2:
                    System.out.print("Enter side1: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter side2: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter side3: ");
                    double side3 = scanner.nextDouble();
                    shapes.add(new Triangle(side1, side2, side3));
                    break;
                case 3:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    shapes.add(new Rectangle(length, height));
                    break;
                case 4:
                    for (Object shape : shapes) {
                        System.out.println(shape.toString());
                    }
                    break;
                case 5:
                    System.out.print("Enter index of first shape to compare: ");
                    int index1 = scanner.nextInt();
                    System.out.print("Enter index of second shape to compare: ");
                    int index2 = scanner.nextInt();
                    if (shapes.get(index1).equals(shapes.get(index2))) {
                        System.out.println("Shapes are equal.");
                    } else {
                        System.out.println("Shapes are not equal.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 0);

        scanner.close();
    }
}
