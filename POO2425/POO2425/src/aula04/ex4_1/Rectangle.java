package aula04.ex4_1;

public class Rectangle {
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
