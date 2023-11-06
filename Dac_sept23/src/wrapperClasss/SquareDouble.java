
package wrapperClasss;


public class SquareDouble {
    public static void main(String[] args) {
        Double number = 5.0;
        Double result = square(number);
        System.out.println("Square: " + result);
    }

    public static Double square(Double number) {
        return number * number;
    }
}
