package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    public int compare(String left, String right) {
        int result = 0;
        if (left.length() == right.length()) {
            for (int i = 0; i < left.length(); i++) {
                result = Integer.compare(left.charAt(i), right.charAt(i));
                if (result != 0) {
                    break;
                }
            }
        } else if (left.length() > right.length()) {
            for (int i = 0; i < right.length(); i++) {
                result = Character.compare(left.charAt(i), right.charAt(i));
                if (result != 0) {
                    break;
                } else {
                    result = 1;
                }
            }
        } else {
            for (int i = 0; i < left.length(); i++) {
                result = Character.compare(left.charAt(i), right.charAt(i));
                if (result != 0) {
                    break;
                } else {
                    result = -1;
                }
            }
        }
        return result;
    }
}
