package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары.
     */
    public static float rubleToDollar(float value) {
        return value / 60;
    }

    /**
     * Конвертируем евро в рубли.
     *
     * @param value евро.
     * @return Рубли.
     */
    public static float euroToRuble(float value) {
        return value * 70;
    }

    /**
     * Конвертируем доллары в рубли.
     *
     * @param value доллары.
     * @return Рубли.
     */
    public static float dollarToRuble(float value) {
        return value * 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
    }

}