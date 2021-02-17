package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    List<Item> items = new ArrayList<>();
    private static Tracker instance = null;
    private int ids = 1;

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> itemsKey = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                itemsKey.add(item);
            }
        }
    return itemsKey;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (Item item : items) {
            if (item != null && item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        item.setId(id);
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.set(i, item);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.remove(i);
                break;
            }
        }
        return true;
    }
}
