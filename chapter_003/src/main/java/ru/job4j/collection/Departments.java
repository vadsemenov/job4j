package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static void main(String[] args) {

    }


    public static List<String> fillGaps(List<String> deps) {

        TreeSet<String> tmp = new TreeSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start = el;
                    tmp.add(el);
                } else {
                    start = start + "/" + el;
                    tmp.add(start);
                }
            }
        }
        return new ArrayList<>(tmp);
    }

    public static List<String> sortAsc(List<String> orgs) {
        Collections.sort(orgs, Comparator.naturalOrder());
        return orgs;
    }

    public static List<String> sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
        return orgs;
    }
}