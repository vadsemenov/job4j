package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int max = Math.max(first, second);

        if (max < third) {
            max = third;
        }
        return max;
    }
}
