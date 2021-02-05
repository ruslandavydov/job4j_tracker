package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select : ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name : ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== All items ===");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.print("Enter name new item : ");
                String newName = scanner.nextLine();
                System.out.print("Enter id item : ");
                int id = Integer.parseInt(scanner.nextLine());
                Item newItem = new Item(newName);
                if (tracker.replace(id, newItem)) {
                    System.out.println("The editing is completed.");
                } else {
                    System.out.println("The editing is not completed.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.print("Enter id item : ");
                int id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("The deleting is completed.");
                } else {
                    System.out.println("The deleting is not completed.");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by id ===");
                System.out.print("Enter id item : ");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("The item with this id is not found.");
                }
            } else if (select == 5) {
                System.out.println("=== Find item by name ===");
                System.out.print("Enter name items : ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("The items with this name are not found.");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println(
                "Menu" + '\n'
                + "0. Add new Item" + '\n'
                + "1. Show all items" + '\n'
                + "2. Edit item" + '\n'
                + "3. Delete item" + '\n'
                + "4. Find item by id" + '\n'
                + "5. Find items by name" + '\n'
                + "6. Exit Program"
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
