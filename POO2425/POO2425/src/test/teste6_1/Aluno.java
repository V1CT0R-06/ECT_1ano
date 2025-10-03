package test.teste6_1;

public class Aluno extends Pessoa {
    private static int nextNMec = 100;
    private int nmec;
    private DateYMD dataInsc;

    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD dataInsc) {
        super(nome, cc, dataNasc);
        this.dataInsc = dataInsc;
        this.nmec = nextNMec++;
    }

    public Aluno(String nome, int cc, DateYMD dataNasc) {
        this(nome, cc, dataNasc, new DateYMD(20, 11, 2006)); // colocar a data atual real seria melhor
    }

    public int getNMec() {
        return nmec;
    }

    @Override
    public String toString() {
        return super.toString() + "; NMec: " + nmec + "; Data de inscrição: " + dataInsc;
    }
}
