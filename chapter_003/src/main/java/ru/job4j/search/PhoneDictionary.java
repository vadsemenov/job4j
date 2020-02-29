package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
        for (var pers : this.persons) {
            if (pers.getAddress().contains(key) || pers.getName().contains(key)
                    || pers.getPhone().contains(key) || pers.getSurname().contains(key)) {
                result.add(pers);
            }
        }
        return result;
    }
}