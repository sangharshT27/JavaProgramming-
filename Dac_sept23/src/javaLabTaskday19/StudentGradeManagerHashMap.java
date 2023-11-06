
package javaLabTaskday19;


       import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeManagerHashMap {

    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Grade Management System");
            System.out.println("1. Add student");
            System.out.println("2. Update grades");
            System.out.println("3. Remove student");
            System.out.println("4. View individual grades");
            System.out.println("5. List all students and grades");
            System.out.println("6. Calculate average grade");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    studentGrades.put(studentName, grade);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.print("Enter student name to update grade: ");
                    studentName = scanner.nextLine();
                    if (studentGrades.containsKey(studentName)) {
                        System.out.print("Enter new grade: ");
                        grade = scanner.nextInt();
                        studentGrades.put(studentName, grade);
                        System.out.println("Grade updated successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter student name to remove: ");
                    studentName = scanner.nextLine();
                    if (studentGrades.containsKey(studentName)) {
                        studentGrades.remove(studentName);
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter student name to view grade: ");
                    studentName = scanner.nextLine();
                    if (studentGrades.containsKey(studentName)) {
                        System.out.println(studentName + "'s grade: " + studentGrades.get(studentName));
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 5:
                    System.out.println("List of all students and grades:");
                    for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 6:
                    int totalGrades = 0;
                    for (int gradeValue : studentGrades.values()) {
                        totalGrades += gradeValue;
                    }
                    double average = (double) totalGrades / studentGrades.size();
                    System.out.println("Average grade for all students: " + average);
                    break;
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
 