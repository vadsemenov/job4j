package ru.job4j.calculator;

/**
 * Class to calculate
 *
 * @author Vadim Semenov
 * @since 13.04.2019
 */
public class Calculator {

    /**
     * Method to add
     *
     * @param first first digit
     * @param second second digit
     * @return result
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Method to subtract
     *
     * @param first first digit
     * @param second second digit
     * @return result
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Method to div
     *
     * @param first first digit
     * @param second second digit
     * @return result
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * Method to multiple
     *
     * @param first first digit
     * @param second second digit
     * @return result
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}
