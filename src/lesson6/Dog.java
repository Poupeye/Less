package lesson6;

public class Dog extends Animals {

    public Dog(int setmaxRun, int setmaxJamp, int setmaxSwim) {
        super(setmaxRun, setmaxJamp, setmaxSwim);
    }

    @Override
    public void swim(int n) {
            System.out.println("собака проплыла " + n + " м");

    }

    @Override
    public void jamp(double n) {
            System.out.println("собака прыгнула " + n + " м");
    }
    @Override
    public void run(int n) {
            System.out.println("собака пробежала " + n + " м");
    }

}
