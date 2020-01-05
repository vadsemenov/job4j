package ru.job4j.Strategy;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(square.draw(), is(new StringBuilder()
                .append("****")
                .append(System.lineSeparator())
                .append("*  *")
                .append(System.lineSeparator())
                .append("*  *")
                .append(System.lineSeparator())
                .append("****")
                .append(System.lineSeparator())
                .toString()));
    }
}
