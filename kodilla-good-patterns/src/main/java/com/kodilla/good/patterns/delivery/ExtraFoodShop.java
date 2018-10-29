package com.kodilla.good.patterns.delivery;

public class ExtraFoodShop implements Producent {
    public void process(){
        System.out.println("Welcome to ExtraFoodShop! We perform order up to 10 products");
    }

    @Override
    public int getLimit() {
        return 10;
    }
}
