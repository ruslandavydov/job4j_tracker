package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> temp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start = el;
                } else {
                    start = start + "/" + el;
                }
                temp.add(start);
            }
        }
        return new ArrayList<>(temp);
    }

    public static List<String> sortAsc(List<String> deps) {
        Set<String> result = new TreeSet<>(fillGaps(deps));
        return new ArrayList<>(result);
    }

    public static List<String> sortDesc(List<String> deps) {
        List<String> result = new ArrayList<>(fillGaps(deps));
        result.sort(new DepDescComp());
        return result;
    }
}
