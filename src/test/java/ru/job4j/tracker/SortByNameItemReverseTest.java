package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByNameItemReverseTest {

    @Test
    public void whenReverseSortByName() {
        List<Item> items = Arrays.asList(
                new Item(2, "Petrov"),
                new Item(1, "Sidorov"),
                new Item(3, "Ivanov")
        );
        List<Item> result = new ArrayList<>(items);
        Collections.sort(result, new SortByNameItemReverse());
        List<Item> expect = new ArrayList<>();
        expect.add(items.get(1));
        expect.add(items.get(0));
        expect.add(items.get(2));
        assertThat(result, is(expect));
    }
}