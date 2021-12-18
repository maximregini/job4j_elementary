package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = (x2 - x1);
        double y = (y2 - y1);
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double sum = first + second;
        double rsl = Math.sqrt(sum);
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