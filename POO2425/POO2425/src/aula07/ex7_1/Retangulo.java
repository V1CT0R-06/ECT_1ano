package aula07.ex7_1;

public class Retangulo extends Forma {
    private double comprimento, altura;

    public Retangulo(String cor, double comprimento, double altura) {
        super(cor);
        if (comprimento <= 0 || altura <= 0) throw new IllegalArgumentException("Medidas inválidas");
        this.comprimento = comprimento;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return comprimento * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (comprimento + altura);
    }

    @Override
    public String toString() {
        return "Retângulo - Comp: " + comprimento + ", Alt: " + altura + ", " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Retangulo)) return false;
        Retangulo outro = (Retangulo) obj;
        return super.equals(obj) &&
               this.comprimento == outro.comprimento &&
               this.altura == outro.altura;
    }
}

