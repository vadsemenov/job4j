package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Input item name:");
        List<Item> items = tracker.findByName(name);
        for (Item item : items) {
            System.out.println(item.getName());
        }
        return true;
    }
}
