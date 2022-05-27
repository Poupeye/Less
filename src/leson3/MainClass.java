package leson3;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(array()));
        System.out.println(Arrays.toString(fillArr()));
        System.out.println(Arrays.toString(multiplyArr()));
        diagonalArr();
        size(6);
        minMaxArr();
    }

    public static int[] array() {
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
        int k = 1;

        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = k++;
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
        array[0][0] = 1;
        array[0][2] = 1;
        array[1][1] = 1;
        array[2][0] = 1;
        array[2][2] = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.println();
        }
        System.out.println("========================================");
    }

    public static int[] size(int len) {
        int[] arr = new int[len];
        int initialValue = 5;

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + initialValue);
        }
        System.out.println();
        return arr;
    }

    // Увы не вышло)
    public static void minMaxArr() {
        int[] maxValue = {8, 2, 6, 3, 9, 4, 2, 8, 1, 3, 6, 5};
        for (int i = 0; i < maxValue.length; i++) {
            if (maxValue[i] >= i) {
                System.out.println(i);
            }
        }

    }


}