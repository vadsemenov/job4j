package ru.job4j.tracker;

import java.util.function.Consumer;

public class FindByIdAction implements UserAction {
    private Consumer<String> output;

    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Input item Id:");
        Item item = tracker.findById(id);
        if (item != null) {
            output.accept("Find item with id:" + item.getId());
        } else {
            output.accept("No one Item was founded.");
        }
        return true;
    }
}
