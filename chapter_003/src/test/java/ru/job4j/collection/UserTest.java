package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameIncrease() {
        User user1 = new User("User1", 10);
        User user2 = new User("User2", 20);
        int rsl = new UserDescByNameIncrease().compare(user1, user2);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameDecrease() {
        User user1 = new User("User1", 10);
        User user2 = new User("User2", 20);
        int rsl = new UserDescByNameDecrease().compare(user1, user2);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByAgeIncrease() {
        User user1 = new User("User1", 10);
        User user2 = new User("User2", 20);
        int rsl = new UserDescByAgeIncrease().compare(user1, user2);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByAgeDecrease() {
        User user1 = new User("User1", 10);
        User user2 = new User("User2", 20);
        int rsl = new UserDescByAgeDecrease().compare(user1, user2);
        assertThat(rsl, greaterThan(0));
    }


    @Test
    public void whenCompatorByNameAndAgeIncrease() {
        Comparator<User> cmpNamePriority = new UserDescByNameIncrease().thenComparing(new UserDescByAgeIncrease());
        int rsl = cmpNamePriority.compare(
                new User("User1", 10),
                new User("User2", 20)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndAgeDecrease() {
        Comparator<User> cmpNamePriority = new UserDescByNameDecrease().thenComparing(new UserDescByAgeDecrease());
        int rsl = cmpNamePriority.compare(
                new User("User1", 10),
                new User("User2", 20)
        );
        assertThat(rsl, greaterThan(0));
    }

}