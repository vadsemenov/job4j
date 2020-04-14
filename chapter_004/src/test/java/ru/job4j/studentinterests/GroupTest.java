package ru.job4j.studentinterests;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.Matchers.is;

public class GroupTest {

    @Test
    public void whenGroupByInterest() {
        Student andrey = new Student("Andrey", Set.of("Волейбол", "Баскетбол", "Футбол"));
        Student mihail = new Student("Mihail", Set.of("Шахматы", "Волейбол", "Футбол"));
        Student anatoliy = new Student("Anatoliy", Set.of("Шахматы", "Баскетбол"));

        Map<String, Set<String>> groups = new HashMap<>();
        groups.put("Баскетбол", Set.of("Andrey", "Anatoliy"));
        groups.put("Шахматы", Set.of("Mihail", "Anatoliy"));
        groups.put("Футбол", Set.of("Mihail", "Andrey"));
        groups.put("Волейбол", Set.of("Mihail", "Andrey"));

        Assert.assertThat(groups, is(Group.sections(List.of(andrey, anatoliy, mihail))));
    }
}