package ru.job4j.tracker;

import java.util.List;

/**
 * Первый вариант Singleton класса Tracker
 */
public enum TrackerSingleEnum1 {
    INSTANCE;

    private static final Tracker TRACKER = new Tracker();

    public Item add(Item item) {
        return TRACKER.add(item);
    }

    public boolean editItem(String id, Item item) {
        return TRACKER.editItem(id, item);
    }


    public boolean delete(String id) {
        return TRACKER.deleteItem(id);
    }


    public List<Item> findAll() {
        return TRACKER.findAll();
    }

    public List<Item> findByName(String key) {
        return TRACKER.findByName(key);
    }

    public Item findById(String id) {
        return TRACKER.findById(id);
    }

}
