package aula07.ex7_1;

public class Triangulo extends Forma {
    private double lado1, lado2, lado3;

    public Triangulo(String cor, double l1, double l2, double l3) {
        super(cor);
        if (!valido(l1, l2, l3)) throw new IllegalArgumentException("Lados inválidos para triângulo");
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }

    private boolean valido(double l1, double l2, double l3) {
        return l1 > 0 && l2 > 0 && l3 > 0 &&
               l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1;
    }

    @Override
    public double getArea() {
        double s = getPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Triângulo - Lados: " + lado1 + ", " + lado2 + ", " + lado3 + ", " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Triangulo)) return false;
        Triangulo outro = (Triangulo) obj;
        return super.equals(obj) &&
               this.lado1 == outro.lado1 &&
               this.lado2 == outro.lado2 &&
               this.lado3 == outro.lado3;
    }
}
