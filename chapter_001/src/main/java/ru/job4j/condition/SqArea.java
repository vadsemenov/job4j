package ru.job4j.condition;

public class SqArea {

    //1. Создайте класс ru.job4j.condition.SqArea. Допишите метод square, используя три формулы для h, l и s.
    //2. Доработайте метод main с демонстрацией работы программы с параметрами p = 6, k = 2, площадь должна быть 2.
    //h = p / (2 * (k + 1));
    //
    //l = h * k;
    //
    //s = l * h;

    public static double square(double p, double k) {
        double rsl = -1;
        double h = p / (2 * (k + 1));
        double l = h * k;
        rsl = l * h;
        return rsl;
    }


    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }

}
