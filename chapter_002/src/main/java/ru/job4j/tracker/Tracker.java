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

    public boolean replace(int id, Item item) {
        boolean result = false;
        int index = id - 1;
        if (items[index] != null) {
            items[index] = item;
            items[index].setId(id);
            result = true;
        }
        return result;
    }

    public boolean delete(int id) {
        boolean result = false;
        int index = id - 1;
        if (items[index] != null) {
            items[index] = null;
            result = true;
        }
        return result;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
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