package test.teste6_1;

public class Test {
    public static void main(String[] args) {
        Aluno al = new Aluno("Andreia Melo", 9855678, new DateYMD(18, 7, 1990), new DateYMD(1, 9, 2018));
        Aluno al2 = new Aluno("João Silva", 8765432, new DateYMD(12, 5, 1991), new DateYMD(20, 11, 2019));
        Professor p1 = new Professor("Jorge Almeida", 3467225, new DateYMD(13, 3, 1967), "Associado", "Informática");

        System.out.println("Aluno: " + al.getName());
        System.out.println(al);
        System.out.println("Aluno: " + al2.getName());
        System.out.println(al2);
        System.out.println("Professor: " + p1.getName());
        System.out.println(p1);
    }
}
