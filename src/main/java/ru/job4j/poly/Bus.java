package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
    }

    @Override
    public void passengers(int number) {
        System.out.println(number);
    }

    @Override
    public int fuel(int quantity) {
        int price = 100;
        int sum = quantity * price;
        return sum;
    }
}
