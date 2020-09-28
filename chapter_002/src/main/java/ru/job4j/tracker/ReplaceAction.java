package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Replace item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id: "));
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Success.");
        } else {
            System.out.println("Failed.");
        }
        return true;
    }
}
