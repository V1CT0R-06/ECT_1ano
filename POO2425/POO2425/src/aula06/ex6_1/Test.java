package aula06.ex6_1;

class DateYMD {
    int dia, mes, ano;

    DateYMD(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

class Pessoa {
    String nome;
    int cartaoCidadao;
    DateYMD nascimento;

    Pessoa(String nome, int cartaoCidadao, DateYMD nascimento) {
        if (nome == null || nome.isEmpty() || cartaoCidadao <= 0 || nascimento == null) {
            throw new IllegalArgumentException("Argumentos inválidos para criar Pessoa");
        }
        this.nome = nome;
        this.cartaoCidadao = cartaoCidadao;
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return nome + "; CC: " + cartaoCidadao + "; Data de Nascimento: " + nascimento;
    }
}

class Aluno extends Pessoa {
    private static int nextMatricula = 100;
    int matricula;
    DateYMD dataInscricao;

    Aluno(String nome, int cartaoCidadao, DateYMD nascimento, DateYMD dataInscricao) {
        super(nome, cartaoCidadao, nascimento);
        this.matricula = nextMatricula++;
        this.dataInscricao = dataInscricao;
    }

    @Override
    public String toString() {
        return "Aluno: " + matricula + " - " + super.toString() + "; Data de Inscrição: " + dataInscricao;
    }
}

class Professor extends Pessoa {
    String categoria;
    String departamento;

    Professor(String nome, int cartaoCidadao, DateYMD nascimento, String categoria, String departamento) {
        super(nome, cartaoCidadao, nascimento);
        this.categoria = categoria;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Professor: " + categoria + "; Departamento: " + departamento + " - " + super.toString();
    }
}

class Bolseiro extends Aluno {
    Professor orientador;
    double bolsa;

    Bolseiro(String nome, int cartaoCidadao, DateYMD nascimento, DateYMD dataInscricao, Professor orientador, double bolsa) {
        super(nome, cartaoCidadao, nascimento, dataInscricao);
        this.orientador = orientador;
        this.bolsa = bolsa;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolseiro: " + bolsa + " - " + super.toString() + "; Orientador: " + orientador;
    }
}

public class Test {
    public static void main(String[] args) {
        DateYMD data = new DateYMD(1, 1, 2000);
        System.out.println(data);

        Pessoa pessoa = new Pessoa("João", 12345678, data);
        System.out.println(pessoa);

        Aluno aluno = new Aluno("Maria", 87654321, data, new DateYMD(1, 9, 2023));
        System.out.println(aluno);

        Professor professor = new Professor("José", 11223344, data, "Catedrático", "Informática");
        System.out.println(professor);

        Bolseiro bolseiro = new Bolseiro("Ana", 55667788, data, new DateYMD(1, 9, 2023), professor, 500);
        System.out.println(bolseiro);
    }
}
