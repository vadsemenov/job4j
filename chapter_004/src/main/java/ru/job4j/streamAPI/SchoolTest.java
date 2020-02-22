package ru.job4j.streamAPI;

import java.util.List;

/**
 * Задача о распределении учеников по классам
 * Stream API
 */
public class SchoolTest {

    public List<Student> class10A(List<Student> students) {
        return School.collect(students, x -> (x.getScore() >= 70) && (x.getScore() <= 100));
    }

    public List<Student> class10B(List<Student> students) {
        return School.collect(students, x -> (x.getScore() >= 50) && (x.getScore() < 70));
    }

    public List<Student> class10V(List<Student> students) {
        return School.collect(students, x -> (x.getScore() >= 0) && (x.getScore() < 50));
    }
}
