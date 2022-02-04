package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int dif = money - price;

        for (int coin : coins) {
            size = fillByCoins(rsl, size, dif, coin);
            dif %= coin;
        }

        return Arrays.copyOf(rsl, size);
    }

    private static int fillByCoins(int[] rsl, int size, int dif, int coin) {
        if (dif >= coin) {
            int numberOfCoin = dif / coin;
            for (int i = size; i < size + numberOfCoin; i++) {
                rsl[i] = coin;
            }
            size += numberOfCoin;
        }
        return size;
    }
}