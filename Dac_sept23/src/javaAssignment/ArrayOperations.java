/*10.Create an array of integers and initialize it with some values.
i)Calculate the sum and average of the array elements.
ii)Find the maximum and minimum values in the array.
iii)Print the results.*/
package javaAssignment;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = { 5, 12, 3, 8, 15, 7, 10 }; 

       
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;

        
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        
        System.out.println("Array Elements: " + java.util.Arrays.toString(numbers));
        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}
