package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtract1Minus1Then0() {
        Calculator calc = new Calculator();
        double result = calc.subtract(1D, 1D);
        double expected = 0D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDiv1On1Then1() {
        Calculator calc = new Calculator();
        double result = calc.div(1D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultiple1On1Then1() {
        Calculator calc = new Calculator();
        double result = calc.multiple(1D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

}