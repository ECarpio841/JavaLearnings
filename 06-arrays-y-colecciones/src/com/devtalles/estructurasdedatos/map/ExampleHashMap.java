package com.devtalles.estructurasdedatos.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

    static void main(String[] args) {

        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Computadora", 1500);
        productPrices.put("Smartphone", 1000);
        productPrices.put("Tablet", 2000);
        productPrices.put("iphone", 4000);

        System.out.println(productPrices);

        System.out.println(productPrices.get("Computadora"));

        productPrices.put("Computadora", 3000);
        System.out.println(productPrices);

        productPrices.remove("Tablet");

        System.out.println(productPrices);
    }


}
