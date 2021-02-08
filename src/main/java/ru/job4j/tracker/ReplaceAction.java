package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        int id = input.askInt("Enter id item : ");
        String newName = input.askStr("Enter name new item : ");
        Item newItem = new Item(newName);
        if (tracker.replace(id, newItem)) {
            out.println("The editing is completed.");
        } else {
            out.println("The editing is not completed.");
        }
        return true;
    }
}
