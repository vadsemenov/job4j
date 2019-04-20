package ru.job4j.array;

import java.util.Arrays;

/**
 * Класс объединяющий 2 массива
 *
 * @author Vadim Semenov
 * @since 20.04.2019
 */
public class Merge {

    public int[] merge(int[] left, int[] right) {
        if (left.length == 0 && right.length == 0) {
            return new int[0];
        } else if (left.length == 0 && right.length != 0) {
            return Arrays.copyOf(right, right.length);
        } else if (left.length != 0 && right.length == 0) {
            return Arrays.copyOf(left, left.length);
        } else if (left.length != 0 && right.length != 0) {
            int[] array = new int[left.length + right.length];
            for (int i = 0; i < left.length; i++) {
                array[i] = left[i];
            }
            for (int i = 0; i < right.length; i++) {
                array[left.length + i] = right[i];
            }
            return array;
        }

        return null;
    }
}
