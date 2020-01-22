package ru.job4j.tracker;

/**
 * Четвертый вариант Singleton класса Tracker
 */
public class TrackerSingleLazy4 {
    private TrackerSingleLazy4() {
    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }
}

