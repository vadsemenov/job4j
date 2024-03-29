package ru.job4j.tracker;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindAllThenReturnAllItems() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Item1");
        Item item2 = new Item("Item2");
        List<Item> items = List.of(item1, item2);
        tracker.add(item1);
        tracker.add(item2);
        List<Item> result = new ArrayList<>();
        result.addAll(tracker.findAll());
        assertThat(result, is(items));
    }

    @Test
    public void whenFindByNameReturnAllFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Item1");
        List<Item> items = List.of(item1);
        tracker.add(item1);
        List<Item> result = new ArrayList<>();
        result.addAll(tracker.findByName("Item1"));
        assertThat(result, is(items));
    }

    @Test
    public void whenFindByIdReturnAllItemById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Item1");
        tracker.add(item1);
        assertThat(item1, is(tracker.findById(item1.getId())));
    }

}

