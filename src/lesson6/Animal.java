package lesson6;

public abstract class  Animal {
    private int maxRun;
    private int maxJamp;
    private int maxSwim;
    private String name;


    public Animal(String name, int maxRun, int maxJamp, int maxSwim) {
        this.maxRun = maxRun;
        this.maxJamp = maxJamp;
        this.maxSwim = maxSwim;
        this.name = name;
        System.out.println(name + " " + maxRun + " " + maxJamp + " " + maxSwim);
    }


    public void run(int n) {
        if (n <= this.maxRun) {
            System.out.println(name + "  run: true");
        } else System.out.println(name + " False");
    }


    public void jamp(int n) {
        if (n <= this.maxJamp) {
            System.out.println(name + " jamp: true");
        } else System.out.println(name + " False");
    }

    public void swim(int n) {
        if (n <= this.maxSwim) {
            System.out.println(name + " swim: true");
        } else System.out.println(name + " False");

    }

}
