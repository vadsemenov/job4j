package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        double weight = Fit.manWeight(180);
        double expected = 92.0;

        Assert.assertEquals(expected, weight, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        double weight = Fit.womanWeight(170);
        double expected = 69.0;

        Assert.assertEquals(expected, weight, 0.01);
    }
}