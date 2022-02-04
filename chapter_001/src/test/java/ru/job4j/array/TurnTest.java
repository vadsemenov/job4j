package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[]{2, 6, 1, 4};
        Assert.assertArrayEquals(result, expect);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[]{4, 1, 5, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[]{2, 6, 5, 1, 4};
        Assert.assertArrayEquals(result, expect);
    }
}