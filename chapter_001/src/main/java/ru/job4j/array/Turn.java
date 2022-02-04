package ru.job4j.array;

import java.util.Arrays;

/**
 * Класс зеркально отражающий массив.
 *
 * @author Vadim Semenov
 */
public class Turn {
    public static int[] back(int[] array) {
        int it;
        for (int i = 0; i < array.length / 2; i++) {
            it = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = it;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] backed = back(new int[]{3, 2, 1});
        System.out.println(Arrays.toString(backed));
    }
}
