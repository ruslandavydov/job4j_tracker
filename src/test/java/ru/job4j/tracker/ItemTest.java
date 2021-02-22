package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void whenCompareSmallToBig() {
        List<Item> items = Arrays.asList(
                new Item(2, "Petrov"),
                new Item(1, "Sidorov"),
                new Item(3, "Ivanov")
        );
        List<Item> result = new ArrayList<>(items);
        Collections.sort(result);
        List<Item> expect = new ArrayList<>();
        expect.add(items.get(1));
        expect.add(items.get(0));
        expect.add(items.get(2));
        assertThat(result, is(expect));
    }

    @Test
    public void whenCompareBigToSmall() {
        List<Item> items = Arrays.asList(
                new Item(2, "Petrov"),
                new Item(1, "Sidorov"),
                new Item(3, "Ivanov")
        );
        List<Item> result = new ArrayList<>(items);
        Collections.sort(result, Collections.reverseOrder());
        List<Item> expect = new ArrayList<>();
        expect.add(items.get(2));
        expect.add(items.get(0));
        expect.add(items.get(1));
        assertThat(result, is(expect));
    }
}
