package ru.job4j.strategy;

public class Paint {

    /**
     * Метод вывод фигуру на печать
     *
     * @param shape Фигура
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}
