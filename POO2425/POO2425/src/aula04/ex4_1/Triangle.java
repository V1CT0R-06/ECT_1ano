package aula04.ex4_1;

public class Triangle {
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
