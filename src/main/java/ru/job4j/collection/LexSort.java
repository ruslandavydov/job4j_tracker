package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String>{

    @Override
    public int compare(String left, String right) {
        String[] leftSplit = left.split("\\.");
        String[] rightSplit = right.split("\\.");
        int result = Integer.compare(left.length(), right.length());
        int min = Math.min(leftSplit.length, rightSplit.length);
        for (int i = 0; i < min; i++) {
            result = Character.compare(left.charAt(i), right.charAt(i));
        }
        return result;
    }
}
