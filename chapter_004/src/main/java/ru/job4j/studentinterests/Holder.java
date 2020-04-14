package ru.job4j.studentinterests;

public class Holder {
    String key, value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    Holder(String key, String value) {
        this.key = key;
        this.value = value;
    }
}