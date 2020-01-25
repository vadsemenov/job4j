package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TrackerSingleEnum1Test {
    @Test
    public void whenEnumTheSameObject() {
    TrackerSingleEnum1 instance1 = TrackerSingleEnum1.INSTANCE;
    TrackerSingleEnum1 instance2 = TrackerSingleEnum1.INSTANCE;
     assertThat(instance1,is(instance2));
    }

}
