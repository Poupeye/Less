package lesson6;

import java.util.Random;

public class Animals {
    public int maxRun;
    public int maxJamp;
    public int maxSwim;
    Random rand = new Random();

    public Animals() {
        this.maxRun = rand.nextInt(300)+100;
        this.maxJamp = rand.nextInt(2)+1;
        this.maxSwim = rand.nextInt(9)+1;
    }



    public void run(int n) {
        System.out.println("пробежал " + n + " м");
    }

    public void jamp(int n) {
        System.out.println("прыгнул " + n + " м");
    }

    public void swim(int n) {
        System.out.println("проплыл " + n + " м");
    }




}
