package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        double expected = 92.0;

        Assert.assertEquals(expected, weight, 0.01);
    }

    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        double expected = 69.0;

        Assert.assertEquals(expected, weight, 0.01);
    }
}