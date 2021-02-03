package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] namesEqKey = new Item[items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if (name.getName().equals(key)) {
                namesEqKey[count] = name;
                count++;
            }
        }
        return Arrays.copyOf(namesEqKey, count);
    }

    public Item findById(int id) {
        Item item = null;
        for (int index = 0; index < size; index++) {
            Item current = items[index];
            if (current.getId() == id) {
                item = current;
                break;
            }
        }
        return item;
    }

    public Item replace(int id, Item name) {
        int index = indexOf(id);
        items[index] = name;
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}
