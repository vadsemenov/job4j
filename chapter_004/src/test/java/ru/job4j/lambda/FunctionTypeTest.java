package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FunctionTypeTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionType.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = FunctionType.diapason(5, 8, x ->Math.log(x));
        List<Double> expected = Arrays.asList(1.6094379124341003D, 1.791759469228055D, 1.9459101490553132D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunctionThenLogarithmicResults() {
        List<Double> result = FunctionType.diapason(5, 8, x -> 2 * Math.pow(x, 2) + x + 1);
        List<Double> expected = Arrays.asList(56D, 79D, 106D);
        assertThat(result, is(expected));
    }

}