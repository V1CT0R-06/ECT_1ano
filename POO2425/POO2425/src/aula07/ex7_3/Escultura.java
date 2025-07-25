package aula07.ex7_3;

public class Escultura extends Obra {
    private String material;
    private boolean unica;
    private int copias;

    public Escultura(String nome, String autor, double precoBase, String material, boolean unica, int copias) {
        super(nome, autor, precoBase);
        this.material = material;
        this.unica = unica;
        this.copias = copias;
    }

    @Override
    public String toString() {
        return super.toString() + " [Escultura: " + material + ", Única: " + (unica ? "Sim" : "Não") + ", Cópias: " + copias + "]";
    }
}

