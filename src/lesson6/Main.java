package lesson6;

import java.util.Random;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Dog dog2 = new Dog( "vasya", rand.nextInt(400)+100, rand.nextInt(1)+1, rand.nextInt(8)+2 );
        Dog dog = new Dog("barbos",500,1,8);
        Dog dog1 = new Dog("lord",600,2,12);
        Cat cat = new Cat("pusy",250,2,0);

        dog.run(600);
        dog.jamp(1);
        dog.swim(5);

        dog1.run(600);
        dog2.run(250);

        cat.jamp(2);
        cat.run(150);
        cat.swim(2);
    }
}
