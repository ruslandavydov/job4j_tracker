package ru.job4j.poly;

public class VehicleUsage {

    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Autobus();
        Vehicle[] vehicles = {airplane, train, bus};
        for (Vehicle i : vehicles) {
            i.move();
            i.maxSpeed();
        }
    }
}
