package ru.job4j.oop;

public class Battary {

    private int load;

    public Battary(int load) {
        this.load = load;
    }

    public void exchange(Battary another) {
        another.load += this.load;
        this.load -= this.load;
    }

    public static void main(String[] args) {
        Battary fist = new Battary(10);
        Battary second = new Battary(5);
        System.out.println("fist : " + fist.load + ". second : " + second.load);
        fist.exchange(second);
        System.out.println("fist : " + fist.load + ". second : " + second.load);
    }
}
