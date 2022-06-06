package lesson6;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.run(170);
        dog.jamp(0.3);
        dog.swim(8);

        cat.jamp(2);
        cat.run(150);
        cat.swim(2);
    }
}
