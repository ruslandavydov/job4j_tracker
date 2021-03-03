package ru.job4j.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixMap {

    public static void main(String[] args) {
        Stream<Stream<Integer>> matrix = Stream.of(
                Stream.of(1, 2, 3),
                Stream.of(4, 5, 6)
        );
        System.out.println(
                matrix.flatMap(Stream::sorted).collect(Collectors.toList())
        );
    }
}
