package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    public int compare(String left, String right) {
        int result = 0;
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            result = Character.compare(right.charAt(i), left.charAt(i));
            if (result != 0) {
                break;
            }
        }
        return result == 0 ? Integer.compare(left.length(), right.length()) : result;
    }
}
