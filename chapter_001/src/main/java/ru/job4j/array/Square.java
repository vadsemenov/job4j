package ru.job4j.array;

/**
 *  Класс Square
 *
 * @author Vadim Semenov (5587394@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i+1, 2);
        }
        return rst;
    }
}