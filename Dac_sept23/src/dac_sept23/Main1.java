package dac_sept23;


abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    @Override
    void eat() {
        System.out.println("The athlete eats a balanced diet for peak performance.");
    }

    @Override
    void exercise() {
        System.out.println("The athlete exercises rigorously to stay in top shape.");
    }
}

class LazyPerson extends Person {
    @Override
    void eat() {
        System.out.println("The lazy person snacks on junk food all day.");
    }

    @Override
    void exercise() {
        System.out.println("The lazy person avoids exercise and prefers a sedentary lifestyle.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();

        System.out.println("Athlete's Daily Routine:");
        athlete.eat();
        athlete.exercise();

        System.out.println("\nLazy Person's Daily Routine:");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}


