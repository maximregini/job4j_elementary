package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl;
        rsl = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(3, 0, 0, 0);
        double result3 = Point.distance(2, 2, 10, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (3, 0) to (0, 0) " + result2);
        System.out.println("result (2, 2) to (10, 0) " + result3);
    }
}