package ru.job4j.tracker;


public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all Item ====");
                Item[] allItems = tracker.findAll();
                if (allItems != null) {
                    for (int i = 0; i < allItems.length; i++) {
                        System.out.println("Item " + allItems[i].getName());
                    }
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");

                String oldId = input.askStr("Input exist item Id:");
                Item item = new Item("newItem");
                if (tracker.editItem(oldId, item)) {
                    System.out.println("Item succsfully edited.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                String id = input.askStr("Input item Id:");
                if (tracker.deleteItem(id)) {
                    System.out.println("Delete item with id " + id);
                } else {
                    System.out.println("No one Item was deleted.");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                String id = input.askStr("Input item Id:");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Find item with id:" + item.getId());
                } else {
                    System.out.println("No one Item was founded.");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                String name = input.askStr("Input item name:");
                Item[] items = tracker.findByName(name);
                if (items != null) {
                    for (int i = 0; i < items.length; i++) {
                        System.out.println("Find item: " + items[i].getName());
                    }
                }
            } else if (select == 6) {
                System.out.println("=== Exit Program ====");
                run = false;
            }
        }

    }

    private void showMenu() {
        System.out.println("Menu:");
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