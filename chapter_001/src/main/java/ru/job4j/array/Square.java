package ru.job4j.array;

/**
 * Класс Square
 * Заполняет массив через цикл элементами от 1 до bound возведенными в квадрат
 *
 * @author Vadim Semenov (5587394@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i, 2);
        }
        return rst;
    }
}