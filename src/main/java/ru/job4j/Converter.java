package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value / 60 * 70;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value / 70 * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        float doll = Converter.euroToDollar(1);
        float eur = Converter.dollarToEuro(1);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println("1 euro are " + doll + " dollar.");
        System.out.println("1 dollar are " + eur + " euro.");
    }
}
