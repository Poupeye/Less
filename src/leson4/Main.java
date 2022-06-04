package leson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

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
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x = -1, y = -1;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X)) {
                        x = j;
                        y = i;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        if (x == -1 && y == -1){
            do{
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            }while (!isCellValid(y,x));
        }
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
            for (int j = 0; j < SIZE; j++) {
                if (gorizontal(i, j, s) || vertical(i, j, s) || diogonal1(i, j, s) || diogonal2(i, j, s))
                    return true;
            }
        }
        return false;
    }

    public static boolean gorizontal(int x, int y, char symbol) {
        if (x < 0 || y < 0 || x + DOTS_TO_WIN > SIZE || y >= SIZE) {
            return false;
        }
        int k = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[i + x][y] == symbol) {
                k++;
            }
        }
        return k == DOTS_TO_WIN;
    }

    public static boolean vertical(int x, int y, char symbol) {
        if (x < 0 || y < 0 || y + DOTS_TO_WIN > SIZE || x >= SIZE) {
            return false;
        }
        int k = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[x][y + i] == symbol) {
                k++;
            }
        }
        return k == DOTS_TO_WIN;
    }

    public static boolean diogonal1(int x, int y, char symbol) {
        if (x < 0 || y < 0 || x + DOTS_TO_WIN > SIZE || y + DOTS_TO_WIN > SIZE) {
            return false;
        }
        int k = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[x + i][y + i] == symbol) {
                k++;
            }
        }
        return k == DOTS_TO_WIN;
    }

    public static boolean diogonal2(int x, int y, char symbol) {
        if (x < 0 || y < 0 || x + DOTS_TO_WIN > SIZE || y + 1 - DOTS_TO_WIN < 0) {
            return false;
        }
        int k = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[x + i][y - i] == symbol) {
                k++;
            }
        }
        return k == DOTS_TO_WIN;
    }

}