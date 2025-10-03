package test;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("what's your income?");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int income = scanner.nextInt();
        
        String hasHighIncome = (income > 100_000) ? "YES! :)" : "Sorry, but you cant go on first class :(";
        System.out.println("can you go on first class? " + hasHighIncome);
        scanner.close();
    }
}
