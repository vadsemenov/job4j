package ru.job4j.tracker;

import java.util.function.Consumer;

public class FindAllAction implements UserAction {
    private Consumer<String> output;

    @Override
    public String name() {
        return "=== Find all ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            output.accept(String.format("%s %s", item.getId(), item.getName()));
        }
        return true;
    }
}
