package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] data = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int u = 0; u < size; u++) {
                data[i][u] = (i + 1) * (u + 1);
            }
        }
        return data;
    }
}
