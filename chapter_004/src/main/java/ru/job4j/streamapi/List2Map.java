package ru.job4j.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Пример преобразования List в Map
 * Stream API
 */
public class List2Map {
    Map<String, Student> list2Map(List<Student> students) {
        return students.stream().distinct().collect(Collectors.toMap(e -> e.getSecondName(), e -> e));
    }
}
