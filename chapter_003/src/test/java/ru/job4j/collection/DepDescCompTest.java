package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class DepDescCompTest {

    @Test
    public void compareEqString() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void compareEqString1() {
        int rsl = new DepDescComp().compare(
                "K1/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, lessThan(0));
    }


}