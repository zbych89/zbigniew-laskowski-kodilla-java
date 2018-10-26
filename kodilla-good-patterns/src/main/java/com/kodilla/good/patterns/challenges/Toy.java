package com.kodilla.good.patterns.challenges;

public class Toy implements Product{
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
