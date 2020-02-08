package ru.job4j.condition;

/**
 * Класс вычисляет большее из двух чисел
 */
public class Max {
    public int max(int left, int right) {
        return left >= right ? left : right;
    }

    public int max(int left, int right, int third) {
        return max(left, max(right, third));
    }

    public int max(int left, int right, int third, int fours) {
        return max(left, max(right, max(third, fours)));
    }
}