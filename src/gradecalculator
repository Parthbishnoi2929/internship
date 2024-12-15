 import java .util.*;
import java .util.Scanner;

public class gradeclaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine();

        // Arrays to store subject names and marks
        String[] subjects = new String[numSubjects];
        double[] marks = new double[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();

            while (true) {
                System.out.print("Enter marks for " + subjects[i] + " (out of 100): ");
                double mark = scanner.nextDouble();
                scanner.nextLine();

                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    break;
                } else {
                    System.out.println("Invalid marks! Marks must be between 0 and 100.");
                }
            }
        }

        double totalMarks = calculateTotalMarks(marks);

        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);

        String grade = calculateGrade(averagePercentage);

        displayResults(subjects, marks, totalMarks, numSubjects, averagePercentage, grade);

        scanner.close();
    }

    public static double calculateTotalMarks(double[] marks) {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    public static double calculateAveragePercentage(double totalMarks, int numSubjects) {
        return totalMarks / numSubjects;
    }

    public static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B+";
        } else if (averagePercentage >= 60) {
            return "B";
        } else if (averagePercentage >= 50) {
            return "C+";
        } else if (averagePercentage >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void displayResults(String[] subjects, double[] marks,
                                      double totalMarks, int numSubjects,
                                      double averagePercentage, String grade) {
        System.out.println("\n--- Student Result ---");
        System.out.println("Subjects and Marks:");

        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%s: %.2f%n", subjects[i], marks[i]);
        }

        System.out.printf("\nTotal Marks: %.2f%n", totalMarks);
        System.out.println("Number of Subjects: " + numSubjects);
        System.out.printf("Average Percentage: %.2f%%%n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
