package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TrackerSingleLazy2Test {
    @Test
    public void whenCreateLazySingleIsTheSameObject() {
        Tracker instance1 = TrackerSingleLazy2.getInstance();
        Tracker instance2 = TrackerSingleLazy2.getInstance();
        assertThat(instance1, is(instance2));
    }
}
