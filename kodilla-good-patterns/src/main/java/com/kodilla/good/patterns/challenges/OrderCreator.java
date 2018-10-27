package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class OrderCreator {
    private static Map<String, Product> someMap = new HashMap<>();
    static{
        someMap.put("PacMan",new Game("PacMan"));
        someMap.put("Mario",new Game("Mario"));
        someMap.put("Rubik's cube",new Toy("Rubik's cube"));
    }

    public static Map<String, Product> getSomeMap() {
        return someMap;
    }

    public static Order createOrder(String product, int quantity){
        return new Order(someMap.get(product),quantity);
    }
}
