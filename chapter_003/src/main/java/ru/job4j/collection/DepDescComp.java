package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        int min = Math.min(o1.length(), o2.length());
        for (int i = 0; i < min; i++) {
            rsl = Character.compare(o2.charAt(i), o1.charAt(i));
            if (rsl != 0) {
                break;
            }
        }
        if (rsl == 0) {
            rsl = o1.length() - o2.length();
        }
        return rsl;
    }
}