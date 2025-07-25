package test.teste6_1;

public class Professor extends Pessoa {
    private String categoria;
    private String departamento;

    public Professor(String nome, int cc, DateYMD dataNasc, String categoria, String departamento) {
        super(nome, cc, dataNasc);
        this.categoria = categoria;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "; Categoria: " + categoria + "; Departamento: " + departamento;
    }
}
