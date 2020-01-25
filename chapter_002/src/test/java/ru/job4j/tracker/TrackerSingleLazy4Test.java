package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TrackerSingleLazy4Test {

    @Test
    public void whenSingleLazyThenTheSameObject() {
        Tracker instance1 = TrackerSingleLazy4.getInstance();
        Tracker instance2 = TrackerSingleLazy4.getInstance();
        assertThat(instance1, is(instance2));

    }
}
