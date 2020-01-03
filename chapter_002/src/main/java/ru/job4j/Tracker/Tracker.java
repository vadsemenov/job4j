package ru.job4j.Tracker;

import java.util.*;

public class Tracker {
    private final Item[] items = new Item[100];
    private int count = 0;

    /**
     * Метод добавляет заявки в трекер.
     *
     * @param item - заявка
     * @return Заявка
     */
    public Item add(Item item) {
        item.setId(generateID());
        return this.items[this.count++] = item;
    }

    /**
     * Метод возвращает массив внесенных заявок.
     *
     * @return Массив внесенных заявок
     */
    public Item[] findAll() {
        Item[] findedItem = new Item[this.items.length];
        int size = 0;
        for (int index = 0; index < this.items.length; index++) {
            Item item = this.items[index];
            if (item != null) {
                findedItem[size] = item;
                size++;
            }
        }
        //System.arraycopy(this.items, 0, findedItem, 0, this.count);
        return Arrays.copyOf(findedItem, size);
    }

    /**
     * Метод возвращает заявки по имени в трекере
     *
     * @param key
     * @return
     */
    public Item[] findByName(String key) {
        Item[] findedItem = new Item[100];
        int numberOfMatches = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (items[i].getName().equals(key)) {
                findedItem[numberOfMatches++] = items[i];
            }
        }
        return Arrays.copyOf(findedItem, numberOfMatches);
    }

    /**
     * Метод возвращает заявку по Id.
     *
     * @param id -Id заявки
     * @return Заявка
     */
    public Item findById(String id) {
        for (int i = 0; i < this.count; i++) {
            if (this.items[i].getId().equals(id)) {
                return this.items[i];
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
        for (int i = 0; i < this.count; i++) {
            if (this.items[i].getId().equals(id)) {
                for (int j = i; j < this.items.length - 1; j++) {
                    this.items[j] = this.items[j + 1];
                }
                this.count--;
                return true;
            }
        }
        return false;
    }

    /**
     * Метод для замены заявок.
     *
     * @param oldId   Id удаляемой заявки
     * @param newName Имя новой заявки
     */
    public Item editItem(String oldId, String newName) {
        for (int i = 0; i < this.count; i++) {
            if (this.items[i].getId().equals(oldId)) {
                Item item = new Item(newName);
                this.items[i] = item;
                return item;
            }
        }
        return null;
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
