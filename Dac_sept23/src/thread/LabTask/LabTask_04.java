//4.Write a Java program that calculates the sum of all prime numbers up to a given limit using
//multiple threads.

package thread.LabTask;




public class LabTask_04 {

    public static void main(String[] args) {
        int limit = 100; // Change this to your desired limit
        long sum = calculatePrimeSum(limit);
        System.out.println("Sum of prime numbers up to " + limit + " is: " + sum);
        
    }

    public static long calculatePrimeSum(int limit) {
    long primeSum = 0;

        for (int number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                primeSum += number;
            }
        }

        return primeSum;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
