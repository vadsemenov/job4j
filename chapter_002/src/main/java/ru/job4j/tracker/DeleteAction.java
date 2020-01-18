package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Input item Id:");
        if (tracker.deleteItem(id)) {
            System.out.println("Delete item with id " + id);
        } else {
            System.out.println("No one Item was deleted.");
        }
        return true;
    }
}
