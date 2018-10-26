package com.kodilla.good.patterns.challenges;

public class Game implements Product {
    private String name;

    public Game(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
