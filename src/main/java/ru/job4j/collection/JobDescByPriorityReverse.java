package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByPriorityReverse implements Comparator<Job> {

    @Override
    public int compare(Job first, Job second) {
        return second.compareTo(first);
    }
}
