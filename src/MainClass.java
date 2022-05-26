import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        print(10);
        System.out.println(bool(5, 5));
        System.out.println(bool2(3));
        printSlova("хер", 5);
        System.out.println(bool3(1992));
    }

    public static boolean bool(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }

    public static void print(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean bool2(int a) {
        return a < 0;
    }

    public static void printSlova(String word, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }

    public static boolean bool3(int year) {
        return year % 4==0 && year%100 !=0||year%400==0;
    }


}
