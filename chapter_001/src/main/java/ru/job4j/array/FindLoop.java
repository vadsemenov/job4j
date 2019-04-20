package ru.job4j.array;


/**
 * Класс реализующий определение индекса
 * элемента массива по значению.
 *
 * @author Vadim Semenov
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}