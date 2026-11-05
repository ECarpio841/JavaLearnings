package com.devtalles.estructurasdedatos.set.treeset;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers);

        numbers.remove(10);
        System.out.println(numbers);

        numbers.remove(60);
        numbers.add(90);

        System.out.println(numbers);

        System.out.println(numbers.contains(20));
    }
}
