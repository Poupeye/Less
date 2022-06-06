package lesson6;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Cat cat = new Cat();

        dog.run(215);
        dog.jamp(1);
        dog.swim(1);
        dog1.run(150);

        cat.jamp(1);
        cat.run(100);
        cat.swim(2);
    }
}
