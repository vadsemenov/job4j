package ru.job4j.tracker;

public class FindByNameAction implements UserAction{
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Input item name:");
        Item[] items = tracker.findByName(name);
        if (items != null) {
            for (int i = 0; i < items.length; i++) {
                System.out.println("Find item: " + items[i].getName());
            }
        }
        return true;
    }
}