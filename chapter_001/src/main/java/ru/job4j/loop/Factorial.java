package ru.job4j.loop;

/**
 * Класс для вычисления факториала
 *
 */
public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}