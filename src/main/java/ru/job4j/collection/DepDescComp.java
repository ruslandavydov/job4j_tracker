package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    public int compare(String first, String second) {
        String[] firstSplit = first.split("/");
        String[] secondSplit = second.split("/");
        int result = secondSplit[0].compareTo(firstSplit[0]);
        return result == 0 ? first.compareTo(second) : result;
    }
}
