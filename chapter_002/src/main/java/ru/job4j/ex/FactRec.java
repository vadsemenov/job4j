package ru.job4j.ex;

/**
 * Расчет факториала через рекурсию
 */
public class FactRec {
    public static int calc(int n) {
        //if else, если n == 1 то нужно вернуть значение return 1, если равно 1, то нужно сделай умножения двух чисел.
        if (n == 1) {
            return 1;
        } else {
            return calc(n - 1) * n;
        }

    }

    public static void main(String[] args) {
        int rsl = calc(6);
        System.out.println(rsl);
    }
}
