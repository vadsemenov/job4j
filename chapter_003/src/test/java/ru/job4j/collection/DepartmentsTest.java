package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = List.of("k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = List.of("k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenBackSorting() {
        List<String> input1 = List.of("k1", "k1/sk1", "k1/sk1/ssk1", "k2", "k2/sk1", "k2/sk1/ssk1");
        List<String>  input  = new ArrayList<String>(input1);
        List<String> expect = List.of("k2", "k2/sk1", "k2/sk1/ssk1", "k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.sortDesc(input);
        assertThat(result, is(expect));
    }

}