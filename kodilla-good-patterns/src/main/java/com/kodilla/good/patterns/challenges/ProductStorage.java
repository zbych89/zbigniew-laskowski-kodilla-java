package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductStorage {
    private static Map<String,Product> someMap = OrderCreator.getSomeMap();
    private static Map<Product,Integer> storageMap = someMap.values().stream()
            .collect(Collectors.toMap(p->p,i -> 3));

    public static Map<Product, Integer> getStorageMap() {
        return storageMap;
    }
}
