package ru.job4j.ex;

import org.junit.Test;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThan1() {
        Fact fact = new Fact();
        fact.calc(-2);
    }
}
