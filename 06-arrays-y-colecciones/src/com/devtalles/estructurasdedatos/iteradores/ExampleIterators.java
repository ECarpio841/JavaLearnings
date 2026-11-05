package com.devtalles.estructurasdedatos.iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterators {
    static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ana");
        names.add("Bna1");
        names.add("Ana2");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            if (name.startsWith("A")) iterator.remove();
        }
        System.out.println(names);
    }

}
