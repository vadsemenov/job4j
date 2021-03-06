package ru.job4j.array;


/**
 * Класс реализует пузырьковую сортировку
 *
 * @author Vadim Semenov
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}