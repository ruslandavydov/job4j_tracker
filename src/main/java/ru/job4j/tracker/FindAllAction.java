package ru.job4j.tracker;

import java.util.*;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "All items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find all items ===");
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            out.println(item);
        }
        return true;
    }
}
