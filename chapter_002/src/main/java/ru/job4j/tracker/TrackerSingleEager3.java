package ru.job4j.tracker;

/**
 * Третий вариант Singleton класса Tracker
 */
public class TrackerSingleEager3 {
    private static final Tracker INSTANCE = new Tracker();

    private TrackerSingleEager3() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }
}
