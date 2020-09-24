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
        Item[] itemsWithoutNull = new Item[size];
        int sizeNotNull = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                itemsWithoutNull[sizeNotNull] = item;
                sizeNotNull++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, sizeNotNull);
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] itemsName = new Item[size];
        int sizeName = 0;
            for (int i = 0; i < size; i++) {
            Item names = items[i];
            if (items[i].getName().equals(key)) {
                itemsName[sizeName] = names;
                sizeName++;
            }
        }
        itemsName = Arrays.copyOf(itemsName, sizeName);
            return itemsName;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}