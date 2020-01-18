package ru.job4j.tracker;

public class ReplaceAction implements UserAction{
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
            System.out.println("Item succsfully edited.");
        }
        return true;
    }
}
