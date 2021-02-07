package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id item : ");
        if (tracker.delete(id)) {
            System.out.println("The deleting is completed.");
        } else {
            System.out.println("The deleting is not completed.");
        }
        return true;
    }
}
