package ru.job4j.sort;

import java.util.Arrays;

/**
 * Жадный алгоритм. Сдача в кофемашине.
 */
public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;

        for (int i = 0; i < coins.length; i++) {
            while (coins[i] <= change) {
                change -= coins[i];
                rsl[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
