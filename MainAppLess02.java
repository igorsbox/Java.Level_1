package Lesson02;
// Домашнее задание. Java. Уровень 1. Урок № 2. Яковлев Игорь
public class MainAppLess02 {

    public static void main(String[] args) {
        System.out.println (checkSum(11, 10));
        System.out.println (checkAndPrintNumber (-100));
        System.out.println (checkNumber (-50));
        printStrNTimes ("What a wonderful day", 5);
        System.out.println (checkLeapYear (2020));
    }
    public static boolean checkSum (int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
    public static String checkAndPrintNumber (int x) {
        if (x >= 0) {
            return (x + " - " + "Number is positive");
        }
            else {
            return (x + " - " + "Number is negative");
            }

    }
    public static boolean checkNumber (int z) {
        if (z < 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void printStrNTimes (String str, int n) {
        while (n > 0) {
            System.out.println(str); n--;
        }
    }
    public static boolean checkLeapYear (int y) {
        if (y % 400 == 0) {
            return true;
        }
        else if (y % 100 == 0 || y % 4 != 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
