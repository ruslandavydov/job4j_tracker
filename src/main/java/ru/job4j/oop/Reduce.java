package ru.job4j.oop;

public class Reduce {
    private int[] array;

    public Reduce(int[] array) {
        this.array = array;
    }

    public void to(int[] array) {
        array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce(array);
        reduce.to(array);
        reduce.print();
    }
}
