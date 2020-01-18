package ru.job4j.ex;


/**
 * Обработка пользовательских Исключений.
 */
public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        // for-each
        for (String val : value) {
            if (val == key) {
                rsl = 1;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Значение не найдено");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"345", "456"}, "789");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
