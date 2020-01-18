package ru.job4j.tracker;

public class ShowAction  implements UserAction{
    @Override
    public String name() {
        return "=== Show all Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] allItems = tracker.findAll();
        if (allItems != null) {
            for (int i = 0; i < allItems.length; i++) {
                System.out.println("Item " + allItems[i].getName());
            }
        }
        return true;
    }
}
