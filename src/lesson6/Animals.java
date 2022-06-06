package lesson6;

import java.util.Random;

public class Animals {
    private int maxRun;
    private int maxJamp;
    private int maxSwim;

    public Animals(int maxRun, int maxJamp, int maxSwim) {
        this.maxRun = maxRun;
        this.maxJamp = maxJamp;
        this.maxSwim = maxSwim;
    }

    public void run(int n) {
        System.out.println("пробежал " + n + " м");
    }

    public void jamp(double n) {
        System.out.println("прыгнул " + n + " м");
    }

    public void swim(int n) {
        System.out.println("проплыл " + n + " м");
    }



    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }



    public void setMaxJamp(int maxJamp) {
        this.maxJamp = maxJamp;
    }



    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }
}
