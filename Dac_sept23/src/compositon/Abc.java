
package compositon;



     class Engine 
    {
    private String type;
    private int horsePower;

    Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}

 class Car {
    private final String name;
    private final Engine engine; // Composition.

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }
}

public class Abc 
{
    public static void main(String[] args) {
        // Creating an object of Engine class.
        Engine engn = new Engine("Petrol", 300);

        // Creating an object of Car class.
        Car car = new Car("Ford", engn);

        System.out.println("Car Name: " + car.getName());
        System.out.println("Engine Type: " + car.getEngine().getType());
        System.out.println("Engine Horse Power: " + car.getEngine().getHorsePower());
    }
}


