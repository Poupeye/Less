package lesson6;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(400,1,10);
        Cat cat = new Cat(150,1,2);

        dog.run(170);
        dog.jamp(0.3);
        dog.swim(8);

        cat.jamp(2);
        cat.run(149);
        cat.swim(2);
    }
}
