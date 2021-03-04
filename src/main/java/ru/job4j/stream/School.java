package ru.job4j.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream()
                .filter(predict)
                .distinct()
                .collect(Collectors.toList());
    }

    public Map<String, Student> map(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        student -> student,
                        (st1, st2) -> st1)
                );
    }
}
