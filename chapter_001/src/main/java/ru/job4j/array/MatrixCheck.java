package ru.job4j.array;

/**
 * Класс реализующий проверку диагоналей
 * массива на заполнение true или false
 *
 * @author Vadim Semenov
 */
public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data[0].length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1]) {
                return false;
            }
            if (data[i][data[1].length - i - 1] != data[i + 1][data[1].length - i - 2]) {
                return false;
            }
        }
        return result;
    }
}