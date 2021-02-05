package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void maxSpeed() {
        System.out.println(getClass().getSimpleName() + " максимальная скорость 400 км/ч");
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по рельсам.");
    }
}
