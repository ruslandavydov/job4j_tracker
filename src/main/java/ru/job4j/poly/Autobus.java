package ru.job4j.poly;

public class Autobus implements Vehicle {
    @Override
    public void maxSpeed() {
        System.out.println(getClass().getSimpleName() + " максимальная скорость 160 км/ч");
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по дорогам.");
    }
}
