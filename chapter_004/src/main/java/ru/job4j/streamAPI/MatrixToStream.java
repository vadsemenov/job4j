package ru.job4j.streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToStream {

    static List<Integer> matrixToList(Integer[][] matrix) {

        return Stream.of(matrix).flatMap(e -> Stream.of(e)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][]{{1, 2, 3}, {4, 5, 6}};
        matrixToList(matrix).forEach(e -> System.out.print(e + " "));
    }

}
