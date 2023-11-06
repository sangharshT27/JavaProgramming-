
package ExceptionHandlingLabtask;


class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

public class NegativeValueExceptionDemo {
    public static void main(String[] args) {
        try {
            int inputValue = -5;
            if (inputValue < 0) {
                throw new NegativeValueException("Input value cannot be negative");
            }
            System.out.println("Input value is: " + inputValue);
        } catch (NegativeValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

