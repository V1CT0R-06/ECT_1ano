package test.teste6_1;

public class Pessoa {
    private String nome;
    private int cc;
    private DateYMD dataNasc;

    public Pessoa(String nome, int cc, DateYMD dataNasc) {
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public String getName() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc;
    }
}

