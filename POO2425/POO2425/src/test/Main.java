package test;

public class Main {
    public static void main(String[] args) {
        System.out.println("how hot/cold is it today?");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } 
        
        else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");
        scanner.close();
    }
}

