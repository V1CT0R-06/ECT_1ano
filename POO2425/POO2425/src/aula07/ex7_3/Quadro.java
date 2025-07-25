package aula07.ex7_3;

public class Quadro extends Obra {
    private String tinta;
    private boolean moldura;
    private String tamanho;

    public Quadro(String nome, String autor, double precoBase, String tinta, boolean moldura, String tamanho) {
        super(nome, autor, precoBase);
        this.tinta = tinta;
        this.moldura = moldura;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + " [Quadro: " + tinta + ", Moldura: " + (moldura ? "Sim" : "Não") + ", Tamanho: " + tamanho + "]";
    }
}
