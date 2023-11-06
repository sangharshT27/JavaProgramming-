
package ExceptionHandlingLabtask;


public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            int index = 6; // Accessing an index beyond the array's length
            int value = numbers[index];
            System.out.println("Value at index " + index + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. " + e.getMessage());
        }
    }
}
