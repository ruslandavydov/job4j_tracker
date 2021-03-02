package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        List<Integer> numbs = new ArrayList<>();
        numbs.add(1);
        numbs.add(-2);
        numbs.add(3);
        numbs.add(-4);
        numbs.add(-5);
        List<Integer> posNumbs = numbs.stream()
                .filter(numb -> numb > 0)
                .collect(Collectors.toList());
        System.out.println(posNumbs);
    }
}
