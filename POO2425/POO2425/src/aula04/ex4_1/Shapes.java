package aula04.ex4_1;

import java.util.ArrayList;
import java.util.Scanner;

import aula04.ex4_1.Rectangle;
import aula04.ex4_1.Triangle;

public class Shapes {
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

class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("Sides must be positive.");
        }
        if (!isValidTriangle(side1, side2, side3)) {
            throw new IllegalArgumentException("Sides do not satisfy the triangle inequality.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if (side1 <= 0) {
            throw new IllegalArgumentException("Side must be positive.");
        }
        if (!isValidTriangle(side1, side2, side3)) {
            throw new IllegalArgumentException("Sides do not satisfy the triangle inequality.");
        }
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if (side2 <= 0) {
            throw new IllegalArgumentException("Side must be positive.");
        }
        if (!isValidTriangle(side1, side2, side3)) {
            throw new IllegalArgumentException("Sides do not satisfy the triangle inequality.");
        }
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if (side3 <= 0) {
            throw new IllegalArgumentException("Side must be positive.");
        }
        if (!isValidTriangle(side1, side2, side3)) {
            throw new IllegalArgumentException("Sides do not satisfy the triangle inequality.");
        }
        this.side3 = side3;
    }

    private boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return Double.compare(triangle.side1, side1) == 0 &&
               Double.compare(triangle.side2, side2) == 0 &&
               Double.compare(triangle.side3, side3) == 0;
    }
}

class Rectangle {
    private double length, height;

    public Rectangle(double length, double height) {
        if (length <= 0 || height <= 0) {
            throw new IllegalArgumentException("Length and height must be positive.");
        }
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive.");
        }
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }
        this.height = height;
    }

    public double calculateArea() {
        return length * height;
    }

    public double calculatePerimeter() {
        return 2 * (length + height);
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", height=" + height + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.length, length) == 0 &&
               Double.compare(rectangle.height, height) == 0;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
}
