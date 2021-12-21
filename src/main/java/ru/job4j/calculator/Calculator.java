package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class Calculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumSubAndDiv(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtract(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumSubAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumAll(10, 20));
    }
}