package com.devtalles.estructurasdedatos.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> cities = new LinkedList<>();
        cities.add("Cuenca");
        cities.add("New York");

        cities.addFirst("London");
        cities.addLast("Berlin");

        System.out.println(cities.get(2));
        System.out.println(cities);
        System.out.println(cities.set(2, "Madrid"));
        System.out.println(cities.remove("New York"));
        System.out.println(cities);

        //BÚSQUEDA
        String searchCity = "Cuenca";
        if (cities.contains(searchCity)){
            System.out.println("Está en la lista");
        }else {
            System.out.println("No está en la lista");
        }

        for (String city : cities){
            System.out.println("city = " + city);
        }

    }
}
