package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentSort {

    List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().sorted().flatMap(Stream::ofNullable)
                .takeWhile(student -> student.getScore() > bound).collect(Collectors.toList());
    }
}
