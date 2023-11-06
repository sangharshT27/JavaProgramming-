/*3.Write a Java program to create an abstract class Instrument with abstract methods play() and
tune(). Create subclasses for Piano and Guitar that extend the Instrument class and implement
the respective methods to play and tune each instrument*/
package javaAssignment;


abstract class Instrument {
    abstract void play();

    abstract void tune();
}


class Piano extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the piano");
    }

    @Override
    void tune() {
        System.out.println("Tuning the piano");
    }
}


class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the guitar");
    }

    @Override
    void tune() {
        System.out.println("Tuning the guitar");
    }
}

public class MusicApp {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[2];
        instruments[0] = new Piano();
        instruments[1] = new Guitar();

        for (Instrument instrument : instruments) {
            instrument.play();
            instrument.tune();
        }
    }
}
