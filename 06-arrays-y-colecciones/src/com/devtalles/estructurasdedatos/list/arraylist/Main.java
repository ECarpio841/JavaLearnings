package com.devtalles.estructurasdedatos.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Ana");
        students.add("Maria");
        students.add("Gabriel");
        students.add("Fernando");


        System.out.println(students.set(0, "Celeste"));
        System.out.println(students);

    }
}
