package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {
    private List<Item> items = new ArrayList<>();


    /**
     * Метод добавляет заявки в трекер.
     *
     * @param item - заявка
     * @return Заявка
     */
    public Item add(Item item) {
        item.setId(generateID());
        this.items.add(item);
        return item;
    }

    /**
     * Метод возвращает массив внесенных заявок.
     *
     * @return Массив внесенных заявок
     */
    public List<Item> findAll() {
        return this.items;
    }

    /**
     * Метод возвращает заявки по имени в трекере
     *
     * @param key
     * @return
     */
    public List<Item> findByName(String key) {
        List<Item> findedItem = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                findedItem.add(item);
            }
        }
        return findedItem;
    }


    /**
     * Метод возвращает заявку по Id.
     *
     * @param id -Id заявки
     * @return Заявка
     */
    public Item findById(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }


    /**
     * Метод удаляющий заявку.
     *
     * @param id ID Заявки
     */
    public Boolean deleteItem(String id) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getId().equals(id)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }


    /**
     * Метод для замены заявок.
     *
     * @param id   Id заменяемой заявки
     * @param item новая заявка
     * @return boolean
     */
    public boolean editItem(String id, Item item) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getId().equals(id)) {
                items.set(i, item);
                return true;
            }
        }
        return false;
    }


    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateID() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
