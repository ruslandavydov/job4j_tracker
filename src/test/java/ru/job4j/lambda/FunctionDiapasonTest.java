package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FunctionDiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionDiapason.diapason(5, 8, x -> x + 1);
        List<Double> expected = Arrays.asList(6D, 7D, 8D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = FunctionDiapason.diapason(5, 8, x -> Math.pow(x, 2.0) + 1);
        List<Double> expected = Arrays.asList(26D, 37D, 50D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = FunctionDiapason.diapason(5, 8, x -> Math.pow(x, x) + 1);
        List<Double> expected = Arrays.asList(3126D, 46657D, 823544D);
        assertThat(result, is(expected));
    }
}