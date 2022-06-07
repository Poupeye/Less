package lesson6;

import java.util.Random;

public class Animals {
    private int maxRun;
    private int maxJamp;
    private int maxSwim;
    private String name;


    public Animals(String name, int maxRun, int maxJamp, int maxSwim) {
        this.maxRun = maxRun;
        this.maxJamp = maxJamp;
        this.maxSwim = maxSwim;
        this.name = name;
        System.out.println(name + " " + maxRun + " " + maxJamp + " " + maxSwim);
    }

    public Animals() {
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

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public void setMaxJamp(int maxJamp) {
        this.maxJamp = maxJamp;
    }


    public void setName(String name) {
        this.name = name;
    }
}
