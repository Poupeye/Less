package lesson6;

public class Cat extends Animals {

    public Cat() {
        System.out.println("maxRun " + maxRun + " " + "maxJamp " + maxJamp + " " + "maxSwim " + maxSwim);
    }

    @Override
    public void run(int n) {
        if (n <= this.maxRun) {
            System.out.println("run: true");
        } else System.out.println("False");
    }

    @Override
    public void jamp(int n) {
        if (n <= this.maxJamp) {
            System.out.println("jamp: true");
        } else System.out.println("False");
    }

    @Override
    public void swim(int n) {
        System.out.println("swim: false");
    }
}
