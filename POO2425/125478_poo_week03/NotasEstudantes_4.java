package aula03;

import java.util.*;
import java.util.stream.Collectors;

public class NotasEstudantes_4 {
    
    record Student(String name, double noteP, double noteT) {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.println("Enter student data (name, noteP, noteT) separated by spaces (or 'fim' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fim")) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts.length == 3) {
                try {
                    students.add(new Student(
                        parts[0], 
                        Double.parseDouble(parts[1]), 
                        Double.parseDouble(parts[2])
                    ));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid numbers for noteP and noteT.");
                }
            } else {
                System.out.println("Invalid input. Please enter data in the format: name noteP noteT");
            }
        }

        // Calculate averages
        double avgNoteP = students.stream().mapToDouble(Student::noteP).average().orElse(0);
        double avgNoteT = students.stream().mapToDouble(Student::noteT).average().orElse(0);

        // Find students with noteT above average
        List<String> aboveAvgNoteT = students.stream()
                .filter(s -> s.noteT() > avgNoteT)
                .map(Student::name)
                .collect(Collectors.toList());

        // Print results
        System.out.printf("Average noteP: %.2f%n", avgNoteP);
        System.out.printf("Average noteT: %.2f%n", avgNoteT);
        System.out.println("Students with noteT above average: " + aboveAvgNoteT);

        scanner.close();
    }
}
