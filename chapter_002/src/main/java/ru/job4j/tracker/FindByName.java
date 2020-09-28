package ru.job4j.tracker;

public class FindByName implements UserAction {
    @Override
    public String name() {
        return "=== Find Items By Name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] itemsByName = tracker.findByName(name);
        if (itemsByName.length > 0) {
            for (int i = 0; i < itemsByName.length; i++) {
                System.out.println(itemsByName[i]);
            }
        } else {
            System.out.println("Items not founded.");
        }
        return true;
    }
}
