package lesson6;

public class Dog extends Animals {

    @Override
    public void swim(int n) {
        if (n > 10 || n <= 0) {
            System.out.println("собака столько проплыть не может");
        } else {
            System.out.println("собака проплыла " + n + " м");
        }
    }

    @Override
    public void jamp(double n) {
        if (n > 0.5 || n <= 0) {
            System.out.println("собака так прыгнуть не может");
        } else  {
            System.out.println("собака прыгнула " + n + " м");

        }
    }
    @Override
    public void run(int n) {
        if (n > 500 || n <= 0) {
            System.out.println("собака столько пробижать не может");
        } else  {
            System.out.println("собака пробежала " + n + " м");

        }

    }

}
