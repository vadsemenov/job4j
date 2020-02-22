package ru.job4j.tracker;

import java.util.function.Consumer;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    private Consumer<String> output;

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Input item Id:");
        if (tracker.deleteItem(id)) {
            output.accept("Delete item with id " + id);
        } else {
            output.accept("No one Item was deleted.");
        }
        return true;
    }
}
