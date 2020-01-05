package ru.job4j.Strategy;

/**
 * Класс треугольника
 */
public class Triangle implements Shape {

    /**
     * Метод рисует треугольник
     *
     * @return Треугольник
     */
    @Override
    public String draw() {
        StringBuilder triangle = new StringBuilder();
        triangle.append("*");
        triangle.append(System.lineSeparator());
        triangle.append("**");
        triangle.append(System.lineSeparator());
        triangle.append("***");
        return triangle.toString();
    }
}
