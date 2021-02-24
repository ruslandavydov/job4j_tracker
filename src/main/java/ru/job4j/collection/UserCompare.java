package ru.job4j.collection;

import java.util.Comparator;

public class UserCompare implements Comparator<User> {

    @Override
    public int compare(User first, User second) {
        int result = first.getName().compareTo(second.getName());
        return result != 0 ? result : Integer.compare(first.getAge(), second.getAge());
    }
}
