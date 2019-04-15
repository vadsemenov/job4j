package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {

        int it;
        for (int i = 0; i < array.length / 2; i++) {
            it = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = it;
        }
        return array;
    }
}
