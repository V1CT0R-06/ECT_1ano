package aula07.ex7_3;

public class Obra {
    private static int contador = 33;
    private final int id;
    protected String nome, autor;
    protected double precoBase;
    protected boolean vendida = false;

    public Obra(String nome, String autor, double precoBase) {
        this.nome = nome;
        this.autor = autor;
        this.precoBase = precoBase;
        this.id = contador++;
    }

    public int getId() { return id; }
    public double getPrecoBase() { return precoBase; }
    public boolean isVendida() { return vendida; }
    public void vender() { vendida = true; }

    public double lucro(double precoVenda) {
        return precoVenda - precoBase;
    }

    public String toString() {
        return "#" + id + " \"" + nome + "\" de " + autor + " (base: " + precoBase + "€)";
    }
}
