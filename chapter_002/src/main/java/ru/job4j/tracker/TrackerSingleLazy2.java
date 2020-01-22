package ru.job4j.tracker;

/**
 * Второй вариант Singleton класса Tracker
 */
public class TrackerSingleLazy2 {
    private static Tracker instance;

    private TrackerSingleLazy2() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
}
