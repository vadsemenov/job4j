package ru.job4j.condition;

/**
 * Класс Point
 */
public class Point {
    /**
     * Класс вычисляет расстояние
     *
     * @param x1 координата x1
     * @param y1 координата y1
     * @param x2 координата x2
     * @param y2 координата y2
     * @return дистанция
     */
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
