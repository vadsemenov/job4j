package ru.job4j.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Пример использования Функциональных интерфейсов, лямбда выражений,
 * методов в лямбда выражениях
 */
public class FunctionalInterfaces {

    public static void main(String[] args) {
        FunctionalInterfaces calc = new FunctionalInterfaces();
        calc.multiple(
                0, 10, 2,
                (value, index) -> {
                    double result = value * index;
                    System.out.printf("Multiple %s * %s = %s %n", value, index, result);
                    return result;
                },
                result -> System.out.println(result)
        );


        calc.multiple(0, 3, 2,
                FunctionalInterfaces::add,
                result -> System.out.println(result));


    }

    public static double add(int first, int second) {
        return first + second;
    }

    public void multiple(int start, int finish, int value,
                         BiFunction<Integer, Integer, Double> op,
                         Consumer<Double> media) {
        for (int index = start; index != finish; index++) {
            media.accept(op.apply(value, index));
        }
    }


    public interface Operation {
        double calc(int left, int right);
    }
}
