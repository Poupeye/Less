package lesson6;

import java.util.Random;

public class Cat extends Animals {

    public Cat(String name, int maxRun, int maxJamp) {
        setName(name);
        setMaxRun(maxRun);
        setMaxJamp(maxJamp);
    }



    @Override
    public void jamp(int n) {
        super.jamp(n);
    }

    @Override
    public void swim(int n) {
        super.swim(n);
    }

    @Override
    public void run(int n) {
        super.run(n);
    }
}
