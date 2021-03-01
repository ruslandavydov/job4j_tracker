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

    public static void sortAsc(List<String> orgs) {
        List<String> rsl = Departments.fillGaps(orgs);
        Collections.sort(rsl);
    }

    public static void sortDesc(List<String> orgs) {
        List<String> rsl = Departments.fillGaps(orgs);
        Collections.sort(rsl, new DepDescComp());
    }
}
