package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        /// for-each
        for (int[] mass : list ) {
            for (int digit :mass) {
                rsl.add(digit);
            }
        }
        return rsl;
    }
}