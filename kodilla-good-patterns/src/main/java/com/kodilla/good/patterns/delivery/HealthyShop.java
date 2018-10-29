package com.kodilla.good.patterns.delivery;

public class HealthyShop implements Producent {
    @Override
    public void process() {
        System.out.println("Welcome to our shop! The best healthy products ony from us (no more that 15 per purchase)");
    }

    @Override
    public int getLimit() {
        return 15;
    }
}
