package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        // for orders
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }

//        Внутри метода process нужно пройти по всем элементам списка orders и вставить их в map.
//        Чтобы пройти по элементам orders используйте цикл for-earch.
//        Чтобы вставить данные в map используйте метод map.put. Первый параметр будет номер,
//        а второй заявка.

        return map;
    }
}