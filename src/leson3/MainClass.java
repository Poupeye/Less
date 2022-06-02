package leson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        guessNumber();
        gameArr();

    }

    public static void guessNumber() {
        int count = 1;
        int repid;
        do {
            int number = rand.nextInt(10);
            for (int i = 0; i < 3; i++) {
                int guess = sc.nextInt();
                if (guess > number) {
                    System.out.println("Не верно, число меньше попытка" + count);
                    count++;
                } else if (guess < number) {
                    System.out.println("не верно число больше попытка" + count);
                    count++;
                } else if (guess == number) {
                    System.out.println("Congratulation");
                    break;
                }
            }
            count = 1;
            System.out.println("Хотите сыграть еще раз нажмите 1");
            repid = sc.nextInt();

        } while (repid == 1);

    }

    public static void gameArr() {
        String[] word = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int suspense = rand.nextInt(word.length);
        System.out.println(word[suspense]);
        while (true) {
            System.out.println("Введите слово");
            String answer = sc.nextLine();
            if (answer.equals(word[suspense])) {
                System.out.println("Верно");
                break;
            } else if (answer.equals("stop")) {
                System.out.println("Пощел на хер слабак");
                break;
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < answer.length() && i < word[suspense].length() && answer.charAt(i) == word[suspense].charAt(i)) {
                        System.out.print(answer.charAt(i));
                    } else {
                        System.out.print("*");
                    }
                }
            }
        }
        System.out.println("Спасибо за игру");
    }
}




