package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        return String.valueOf(word).endsWith(String.valueOf(post));
    }
}