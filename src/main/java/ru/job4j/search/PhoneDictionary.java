package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> perName = person -> key.contains(person.getName());
        Predicate<Person> perSurname = person -> key.contains(person.getSurname());
        Predicate<Person> perPhone = person -> key.contains(person.getPhone());
        Predicate<Person> perAddress = person -> key.contains(person.getAddress());
        Predicate<Person> combine = perName.or(perSurname).or(perPhone).or(perAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            //if  (person.getName().contains(key)
            //       || person.getSurname().contains(key)
            //       || person.getPhone().contains(key)
            //       || person.getAddress().contains(key)) {
            result.add(person);
            }
        }
        return result;
    }
}
