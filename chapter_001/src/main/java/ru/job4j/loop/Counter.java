package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = 0; i <= finish; i++) {
            sum = i % 2 == 0 ? sum + i : sum;
        }
        return sum;
    }
}