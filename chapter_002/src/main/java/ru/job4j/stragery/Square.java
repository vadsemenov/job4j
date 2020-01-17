package ru.job4j.stragery;

/**
 * Класс квадрата
 */
public class Square implements Shape {

    /**
     * Метод рисует квадрат
     *
     * @return Квадрат
     */
    @Override
    public String draw() {
        StringBuilder square = new StringBuilder();
        square.append("****");
        square.append(System.lineSeparator());
        square.append("*  *");
        square.append(System.lineSeparator());
        square.append("*  *");
        square.append(System.lineSeparator());
        square.append("****");
        return square.toString();
    }
}
