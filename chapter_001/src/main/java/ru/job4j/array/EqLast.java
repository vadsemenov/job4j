package ru.job4j.array;

/**
 * Сравнивает последние элементы массивов.
 */
public class EqLast {
    public static boolean check(int[] left, int[] right) {
        if (left[left.length - 1] == right[right.length - 1]) {
            return true;
        }
        return false;
    }
}