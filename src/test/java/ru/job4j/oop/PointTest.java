package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistanceEq2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, is(2.0));
    }

    @Test
    public void distance3d() {
        Point a = new Point(0, 5, 1);
        Point b = new Point(0, 2, 0);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(3.16, 0.01));
    }
}