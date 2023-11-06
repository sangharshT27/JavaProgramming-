import java.util.Scanner;

public class AsteriskPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose a pattern (1-4, 0 to exit):");
            System.out.println("1. Right Triangle");
            System.out.println("2. Inverted Right Triangle");
            System.out.println("3. Pyramid");
            System.out.println("4. Inverted Pyramid");
            System.out.println("0. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRightTriangle();
                    break;
                case 2:
                    printInvertedRightTriangle();
                    break;
                case 3:
                    printPyramid();
                    break;
                case 4:
                    printInvertedPyramid();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }

    // Method to print a right triangle of asterisks
    public static void printRightTriangle() {
        int rows = 5; // You can change the number of rows as needed

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print an inverted right triangle of asterisks
    public static void printInvertedRightTriangle() {
        int rows = 5; // You can change the number of rows as needed

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print a pyramid of asterisks
    public static void printPyramid() {
        int rows = 5; // You can change the number of rows as needed

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print an inverted pyramid of asterisks
    public static void printInvertedPyramid() {
        int rows = 5; // You can change the number of rows as needed

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
