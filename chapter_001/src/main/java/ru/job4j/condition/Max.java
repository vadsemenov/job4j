package ru.job4j.condition;

/**
 * Класс вычисляет большее из двух чисел
 *
 */
public class Max {
    public int max(int left, int right) {
        return left >= right ? left : right;
    }
}