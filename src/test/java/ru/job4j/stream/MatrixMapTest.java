package ru.job4j.stream;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixMapTest {

    @Test
    public void whenMatrixToList() {
        Integer[][] matrix = {{1, 2}, {3, 4}};
        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> rsl = MatrixMap.mtxMap(matrix);
        assertThat(rsl, is(expected));
    }
}
