package com.kodilla.good.patterns.delivery;

public class GlutenFreeShop implements Producent {

    public int getLimit() {
        return 5;
    }

    @Override
    public void process() {
        System.out.println("Hello! You can order up to 5 gluten-free products here.");
    }
}
