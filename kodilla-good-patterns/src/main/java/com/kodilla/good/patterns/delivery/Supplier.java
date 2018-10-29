package com.kodilla.good.patterns.delivery;

public class Supplier {
    private String name;

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Supplier: " + name;
    }
}
