package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id item : ");
        String newName = input.askStr("Enter name new item : ");
        Item newItem = new Item(newName);
        if (tracker.replace(id, newItem)) {
            System.out.println("The editing is completed.");
        } else {
            System.out.println("The editing is not completed.");
        }
        return true;
    }
}
