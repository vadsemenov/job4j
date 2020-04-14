package ru.job4j.streamapi;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;

public class SchoolTest {

    @Test
    public void whenStudentScore10AClass() {
        Student vasiliy = new Student();
        vasiliy.setName("Василий");
        vasiliy.setScore(80);
        Student petr = new Student();
        petr.setName("Петр");
        petr.setScore(60);
        Student sergey = new Student();
        sergey.setName("Сергей");
        sergey.setScore(40);

        List<Student> students = List.of(vasiliy, petr, sergey);
        List<Student> expect = List.of(vasiliy);
        List<Student> result = School.collect(students, x -> (x.getScore() >= 70) && (x.getScore() <= 100));

        Assert.assertThat(expect, is(result));
    }

    @Test
    public void whenStudentScore10BClass() {
        Student vasiliy = new Student();
        vasiliy.setName("Василий");
        vasiliy.setScore(80);
        Student petr = new Student();
        petr.setName("Петр");
        petr.setScore(60);
        Student sergey = new Student();
        sergey.setName("Сергей");
        sergey.setScore(40);

        List<Student> students = List.of(vasiliy, petr, sergey);
        List<Student> expect = List.of(petr);
        List<Student> result = School.collect(students, x -> (x.getScore() >= 50) && (x.getScore() < 70));

        Assert.assertThat(expect, is(result));
    }

    @Test
    public void whenStudentScore10VClass() {
        Student vasiliy = new Student();
        vasiliy.setName("Василий");
        vasiliy.setScore(80);
        Student petr = new Student();
        petr.setName("Петр");
        petr.setScore(60);
        Student sergey = new Student();
        sergey.setName("Сергей");
        sergey.setScore(40);

        List<Student> students = List.of(vasiliy, petr, sergey);
        List<Student> expect = List.of(sergey);
        List<Student> result = School.collect(students, x -> (x.getScore() >= 0) && (x.getScore() < 50));

        Assert.assertThat(expect, is(result));
    }
}