package lesson6;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("barbos",500,1,8);
        Dog dog1 = new Dog("lord",600,2,12);
        Cat cat = new Cat("pusy",250,2);

        dog.run(600);
        dog.jamp(1);
        dog.swim(5);

        dog1.run(600);

        cat.jamp(2);
        cat.run(150);
        cat.swim(2);
    }
}
