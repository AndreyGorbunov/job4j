package ru.job4j.tracker;

public class FindById implements UserAction {
    @Override
    public String name() {
        return "=== Find Item By Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id: "));
        Item itemById = tracker.findById(id);
        if (itemById != null) {
            System.out.println(itemById);
        } else {
            System.out.println("Item not founded.");
        }
        return true;
    }
}
