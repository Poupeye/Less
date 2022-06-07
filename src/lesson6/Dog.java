package lesson6;

public class Dog extends Animals {

    public Dog(String name, int maxRun, int maxJamp, int maxSwim) {
        super(name, maxRun, maxJamp, maxSwim);
    }

    @Override
    public void swim(int n) {
        super.swim(n);
    }

    @Override
    public void jamp(int n) {
        super.jamp(n);
    }

    @Override
    public void run(int n) {
        super.run(n);
    }

}
