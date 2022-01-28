package ru.job4j.condition;


import org.junit.Test;


import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;


public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 2), new Point(2, 0));
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }


    @Test
    public void whenAreaSetThree3DPointsThenTriangleArea() {
        Triangle triangle = new Triangle(new Point(0, 0, 2), new Point(0, 2, 0),
                new Point(2, 2, 2));
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }
}