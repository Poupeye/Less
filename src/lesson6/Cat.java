package lesson6;

public class Cat extends Animals {

    public Cat(int setmaxRun, int setmaxJamp, int setmaxSwim) {
        super(setmaxRun, setmaxJamp, setmaxSwim);
    }

    @Override
    public void run(int n) {
            System.out.println("кошка пробежала " + n + " м");
    }

    @Override
    public void jamp(double n) {
            System.out.println("кошка прыгула " + n + " м");
    }
    @Override
    public void swim(int n) {
        System.out.println("кошки не умеют плавать");
    }
}
