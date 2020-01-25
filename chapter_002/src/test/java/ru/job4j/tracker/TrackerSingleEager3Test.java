package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TrackerSingleEager3Test {
    @Test
    public void whenEagerSingleThenTheSameObject() {
        Tracker instance1 = TrackerSingleEager3.getInstance();
        Tracker instance2 = TrackerSingleEager3.getInstance();
        assertThat(instance1, is(instance2));
    }
}
