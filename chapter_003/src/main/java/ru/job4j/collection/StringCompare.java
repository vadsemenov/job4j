package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int small = left.length() <= right.length() ? left.length() : right.length();
        for (int i = 0; i < small; i++) {
            if (Character.compare(left.charAt(i), right.charAt(i)) == 0) { // if(left.charAt(i) == right.charAt(i)){
                if (left.length() < right.length() && i == small - 1) {
                    return -1;
                }
                continue;
            }
            return Integer.compare(left.charAt(i), right.charAt(i));
        }
        return 0;
    }
}