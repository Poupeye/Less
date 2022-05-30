package leson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {

//          System.out.println(Arrays.toString(array()));
//        System.out.println(Arrays.toString(fillArr()));
//        System.out.println(Arrays.toString(multiplyArr()));
//        diagonalArr();
//        size(6, 6);
//        minMaxArr();
//        diagonal();
//        guessNumber();
        gameArr();

    }

//    public static void guessNumber() {
//        int number = rand.nextInt(10);
//        int count = 1;
//        int repid;
//        do {
//            for (int i = 0; i < 3; i++) {
//                int guess = sc.nextInt();
//                if (guess > number) {
//                    System.out.println("Не верно, число меньше попытка" + count);
//                    count++;
//                } else if (guess < number) {
//                    System.out.println("не верно число больше попытка" + count);
//                    count++;
//                } else if (guess == number) {
//                    System.out.println("Congratulation");
//                    break;
//                }
//            }
//            count = 1;
//            System.out.println("Хотите сыграть еще раз нажмите 1");
//            repid = sc.nextInt();
//
//        } while (repid == 1);
//
//    }

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































































    /*public static int[] array() {
        int[] array = {1, 0, 0, 1, 0, 1, 1, 0, 1, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] fillArr() {
        int[] fillArr = new int[100];

        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
        }
        return fillArr;
    }

    public static int[] multiplyArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    public static void diagonalArr() {
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] size(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + initialValue);
        }
        System.out.println();
        return arr;
    }

    public static void minMaxArr() {
        int[] maxValue = {8, 2, 6, 3, 9, 4, 2, 8, 1, 3, 6, 5};
        int max = maxValue[0];
        int min = maxValue[0];

        for (int i = 0; i < maxValue.length; i++) {
            if (maxValue[i] > max) {
                max = maxValue[i];
            } else if (maxValue[i] < min) {
                min = maxValue[i];
            }
        }
        System.out.println("min" + "\t" + min + " " + "max" + "\t" + max);
    }


    public static void diagonal() {
        int[][] array = new int[11][11];

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.println();
        }
        System.out.println("========================================");
    }*/
}




