package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Класс Point
 */
public class Point {

    private int x;
    private int y;
    private int z;
    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     *
     * @param first  координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     *
     * @param first  координата x
     * @param second координата y
     * @param third координата z
     */
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    /**
     * Метод вычисляет расстояние.
     *
     * @param that Точка до которой вычисляется расстояние.
     * @return Дистанцию
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Метод вычисляет расстояние в трех координатах.
     *
     * @param that Точка до которой вычисляется расстояние.
     * @return Дистанцию
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2)+ pow(this.z-that.z,2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

}
