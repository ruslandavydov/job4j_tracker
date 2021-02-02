package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book bookOne = new Book("Изучаем Java", 600);
        Book bookTwo = new Book("Java. Руководство для начинающих", 500);
        Book bookThree = new Book("Грокаем алгоритмы", 300);
        Book bookFour = new Book("Clean code", 200);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        for (int i = 0; i < books.length; i++) {
            Book list = books[i];
            System.out.println(
                    "The book name is " + list.getName() + ", " + list.getPages() + " pages"
            );
        }
        System.out.println(" ");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book list : books) {
            System.out.println(
                    "The book name is " + list.getName() + ", " + list.getPages() + " pages"
            );
        }
        System.out.println(" ");
        for (Book list : books) {
            if (list.getName().equals("Clean code")) {
                System.out.println(
                        "Books with Clean code : " + list.getName() + ", " + list.getPages() + " pages"
                );
            }
        }
    }
}
