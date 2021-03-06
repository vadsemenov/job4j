package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;


/**
 * Пример использования Stream Api.
 * Нахождение объектов с именем BUG
 */
public class StreamUsage {
    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );
        List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);

        long total = tasks.stream().map(
                task -> task.spent
        ).reduce(0L, Long::sum);

        System.out.println(total);
    }

    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{"
                    + "name='" + name + '\''
                    + ", spent=" + spent
                    + '}';
        }
    }
}