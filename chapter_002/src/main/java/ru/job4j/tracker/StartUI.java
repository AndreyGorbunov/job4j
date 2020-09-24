package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();

        Item item1 = new Item();
        item1.setName("ItemOne");
        Item item2 = new Item();
        item2.setName("ItemTwo");

        tracker.add(item1);
        tracker.add(item2);

        System.out.println(tracker.findById(1));

    }

}
