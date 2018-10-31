package com.kodilla.good.patterns.delivery;

import java.util.HashMap;
import java.util.Map;

public class SuppliersList {
    private static Map<String,Supplier> suppliers = new HashMap<>();
    static{
        suppliers.put("Supplier1",new Supplier("Supplier1"));
        suppliers.put("Supplier2",new Supplier("Supplier2"));
        suppliers.put("Supplier3",new Supplier("Supplier3"));
    }
    public static Supplier choose(String name){
        return suppliers.get(name);
    }
}
