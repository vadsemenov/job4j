package ru.job4j.loop;

/**
 * @author Vadim Semenov (5587394@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= width - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}