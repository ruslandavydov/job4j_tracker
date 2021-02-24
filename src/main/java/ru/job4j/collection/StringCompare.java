package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    public int compare(String left, String right) {
        int result = 0;
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                result = Character.compare(left.charAt(i), right.charAt(i));
                break;
            }
        }
        if (result == 0) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}
