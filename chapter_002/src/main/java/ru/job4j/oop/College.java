package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        // Down casting -понижающее приведение
        Freshman freshman = new Freshman();
        Student freshmenToStudent  = freshman;
        Object objectFreshman  = freshmenToStudent;

    }
}
