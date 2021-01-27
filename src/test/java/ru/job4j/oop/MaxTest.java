package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMax5To4Then5() {
        double rsl = Max.max(5, 4);
        assertThat(rsl, is(5.0));
    }

    @Test
    public void whenMax3To5To4Then5() {
        double rsl = Max.max(3, 5, 4);
        assertThat(rsl, is(5.0));
    }

    @Test
    public void whenMax3To2To4To5Then5() {
        double rsl = Max.max(3, 2, 4, 5);
        assertThat(rsl, is(5.0));
    }
}
