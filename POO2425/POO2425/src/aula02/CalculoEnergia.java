package aula02;

public class CalculoEnergia {
    public static void main(String[] args) {
        double massa = 20;
        double temFinal = 60;
        double tempInicial = 30;
        double energia = massa * (temFinal - tempInicial) * 4184;
        System.out.println("A energia é " + energia + " Joules.");
    }
}
