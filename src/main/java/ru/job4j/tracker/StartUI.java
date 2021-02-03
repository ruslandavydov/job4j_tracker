package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item data = new Item();
        LocalDateTime today = data.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String dataFormat = today.format(formatter);

        Tracker tracker = new Tracker();
        Item item = new Item();
        tracker.add(item);
        item.setName("Win");
        item.setId(13);
        System.out.println(tracker.findById(13));
    }
}
