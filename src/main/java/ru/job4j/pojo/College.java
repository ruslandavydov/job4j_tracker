package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ruslan");
        student.setSurname("Davydov");
        student.setGroup(444050);
        student.setDate(new Date());

        System.out.println(
                student.getName() + " " + student.getSurname()
                + " lear in group - " + student.getGroup()
        );
    }
}
