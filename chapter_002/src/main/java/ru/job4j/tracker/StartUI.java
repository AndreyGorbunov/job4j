package ru.job4j.tracker;


public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);

            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }

            } else if (select == 2) {
                int id = Integer.valueOf(input.askStr("Enter id: "));
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Success.");
                } else {
                    System.out.println("Failed.");
                }

            } else if (select == 3) {
                int id = Integer.valueOf(input.askStr("Enter id: "));
                if (tracker.delete(id)) {
                    System.out.println("Item deleted successfully.");
                } else {
                    System.out.println("Failed. Item not founded.");
                }

            } else if (select == 4) {
                int id = Integer.valueOf(input.askStr("Enter id: "));
                Item itemById = tracker.findById(id);
                if (itemById != null) {
                    System.out.println(itemById);
                } else {
                    System.out.println("Item not founded.");
                }

            } else if (select == 5) {
                String name = input.askStr("Enter name: ");
                Item[] itemsByName = tracker.findByName(name);
                if (itemsByName.length > 0) {
                    for (int i = 0; i < itemsByName.length; i++) {
                        System.out.println(itemsByName[i]);
                    }
                } else {
                    System.out.println("Items not founded.");
                }

            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
