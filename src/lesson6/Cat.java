package lesson6;

public class Cat extends Animals {

    @Override
    public void run(int n) {
        if (n > 200 || n <= 0) {
            System.out.println("кошка столько пробижать не может");
        } else {
            System.out.println("кошка пробежала " + n + " м");

        }
    }

    @Override
    public void jamp(double n) {
        if (n > 2 || n <= 0) {
            System.out.println("кошка так прыгать не может");
        } else {
            System.out.println("кошка прыгула " + n + " м");
        }
    }
    @Override
    public void swim(int n) {
        System.out.println("кошки не умеют плавать");
    }
}
