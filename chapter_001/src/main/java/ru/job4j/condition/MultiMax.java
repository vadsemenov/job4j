package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        result = (second >= first) && (second >= third) ? second : (first >= third) ? first : third;
        return result;
    }
}

