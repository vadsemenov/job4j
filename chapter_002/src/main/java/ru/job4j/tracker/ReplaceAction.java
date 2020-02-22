package ru.job4j.tracker;

import java.util.function.Consumer;

public class ReplaceAction implements UserAction {
    private Consumer<String> output;

    @Override
    public String name() {
        return "=== Replace Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String oldId = input.askStr("Input exist item Id:");
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        if (tracker.editItem(oldId, item)) {
            output.accept("Item succsfully edited.");
        }
        return true;
    }
}
