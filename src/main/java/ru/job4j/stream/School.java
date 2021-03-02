package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> cls = students.stream()
                .filter(predict.or(student -> student.getScore() >= 70))
                .collect(Collectors.toList()).stream()
                .filter(predict.or(student -> student.getScore() < 70 && student.getScore() >= 50))
                .collect(Collectors.toList()).stream()
                .filter(predict.or(student -> student.getScore() < 50))
                .collect(Collectors.toList());
        return cls;
    }
}
