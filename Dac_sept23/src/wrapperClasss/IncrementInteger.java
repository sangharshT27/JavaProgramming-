
package wrapperClasss;


public class IncrementInteger {
    public static void main(String[] args) {
        Integer value = 10;
        incrementValue(value);
        System.out.println("New value: " + value);
    }

    public static void incrementValue(Integer number) {
        number++; // This will increment the Integer object.
    }
}

