package ru.job4j.studentInterests;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {

    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getUnits().stream()
                        .map(unit -> new Holder(unit, student.getName())))
                .collect(Collectors.groupingBy(h -> h.key, Collector.of(HashSet::new, (set, el) -> set.add(el.value),
                        (left, right) -> {
                            left.addAll(right);
                            return left;
                        })));
    }
}
