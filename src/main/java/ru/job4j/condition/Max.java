package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int right, int median) {
        return max(left, max(right, median));
    }

    public static int max(int left, int right, int median, int dead) {
        return max(max(left, right), max(median, dead));
    }
}