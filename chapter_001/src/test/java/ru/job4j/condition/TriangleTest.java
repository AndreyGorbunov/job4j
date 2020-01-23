package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void whenAreaIs2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);

        Triangle triangle = new Triangle(a, b, c);

        double result = triangle.area();

        double expected = 2;

        assertEquals(result, expected, 0.000000001);
    }


    @Test
    public void whenAreaIs1() {
        Point a = new Point(3, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);

        Triangle triangle = new Triangle(a, b, c);

        double result = triangle.area();

        double expected = 1;

        assertEquals(result, expected, 0.000000001);
    }
}