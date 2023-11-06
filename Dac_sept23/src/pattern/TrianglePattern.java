
package pattern;

public class TrianglePattern {
    void equilateralTriangle() {
        int n = 5;  // Change this value to adjust the size of the triangle

        for (int i = 1; i <= n; i++) {
            // Print spaces before each row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TrianglePattern t = new TrianglePattern();
        t.equilateralTriangle();
    }
}
