class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class CastingExample {
    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Dog(); // Upcasting from Dog to Animal
        animal.makeSound(); // Calls the overridden method in Dog

        // Downcasting
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting from Animal to Dog
            dog.makeSound(); // Calls the overridden method in Dog
        } else {
            System.out.println("Animal cannot be downcast to Dog.");
        }
    }
}
