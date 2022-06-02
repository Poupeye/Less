package leson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int SIZE = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            HumanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Вы проиграли!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void HumanTurn() {
        int x, y;
        do {
            System.out.println("Введите координат X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x, y;
        do {
//            for (int i = 0; i < SIZE; i++) {
//                if (map[i][map.length - 3] == DOT_X && map[i][map.length - 2] == DOT_X) {
//                    x = map[i + 1];
//                    y = map.length;
//                }
//            }
            y = rand.nextInt(SIZE);
            x = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char s) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][map.length - 3] == s && map[i][map.length - 2] == s && map[i][map.length - 1] == s)
                return true;
            if (map[map.length - 3][i] == s && map[map.length - 2][i] == s && map[map.length - 1][i] == s)
                return true;
            if (map[map.length - 3][map.length - 3] == s && map[map.length - 2][map.length - 2] == s && map[map.length - 1][map.length - 1] == s)
                return true;
            if (map[map.length - 1][map.length - 3] == s && map[map.length - 2][map.length - 2] == s && map[map.length - 3][map.length - 1] == s)
                return true;
        }
        return false;
    }

}