package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class FindByNameAction implements UserAction {
    private Consumer<String> output;

    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Input item name:");
        List<Item> items = tracker.findByName(name);
        for (Item item : items) {
            output.accept(item.getName());
        }
        return true;
    }
}
