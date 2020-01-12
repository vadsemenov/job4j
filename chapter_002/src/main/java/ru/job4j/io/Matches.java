package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int spi4ki = 11;
        String winer = "";
        int select;
        Scanner input = new Scanner(System.in);

        while (spi4ki > 0) {
            winer = "Игрок 1";
            System.out.println("Игрок 1 введите колличество спичек от 1 до 3:");
            select = Integer.valueOf(input.nextLine());
            spi4ki -= select;
            System.out.println("На столе осталось спичек " + spi4ki);

            winer = "Игрок 2";
            System.out.println("Игрок 2 введите колличество спичек от 1 до 3:");
            select = Integer.valueOf(input.nextLine());
            spi4ki -= select;
            System.out.println("На столе осталось спичек " + spi4ki);
        }
        System.out.println("Победитель " + winer + "!");
    }
}
