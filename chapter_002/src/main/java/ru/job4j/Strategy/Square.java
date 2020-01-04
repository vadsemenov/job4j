package ru.job4j.Strategy;

/**
 * Класс квадрата
 */
public class Square implements Shape {

    /**
     * Метод рисует квадрат
     * @return Квадрат
     */
    @Override
    public String draw() {
        StringBuilder square = new StringBuilder();
        square.append("****");
        square.append("*  *");
        square.append("*  *");
        square.append("****");
        return square.toString();
    }
}
