
package wrapperClasss;


public class PrimitiveToWrapperConversion {
    public static void main(String[] args) {
        int primitiveInt = 42;
        float primitiveFloat = 3.14f;

        // Converting int to Integer object
        Integer wrapperInt = Integer.valueOf(primitiveInt);

        // Converting float to Float object
        Float wrapperFloat = Float.valueOf(primitiveFloat);

        System.out.println("Integer object: " + wrapperInt);
        System.out.println("Float object: " + wrapperFloat);
    }
}
