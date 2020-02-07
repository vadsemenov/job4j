package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortItemIncreaseTest {

    @Test
    public void whenCompareThenRise() {
        Item firstItem = new Item("First Item");
        Item secondItem = new Item("Second Item");
        Item thirdItem = new Item("Third Item");
        firstItem.setId("1");
        secondItem.setId("2");
        thirdItem.setId("3");
        List<Item> items = Arrays.asList(secondItem, firstItem, thirdItem);

        Collections.sort(items, new SortItemIncrease());

        assertThat(items, is(List.of(firstItem, secondItem, thirdItem)));
    }
}