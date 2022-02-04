package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCheck2Test {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck2.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck2.monoHorizontal(input, row);
        Assert.assertFalse(result);
    }

}