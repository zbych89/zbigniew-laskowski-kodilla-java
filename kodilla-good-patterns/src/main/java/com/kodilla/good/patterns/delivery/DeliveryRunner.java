package com.kodilla.good.patterns.delivery;

public class DeliveryRunner {
    Producent producent = new GlutenFreeShop();
    public void run(){
        SupplierDTO dto = producent.getInfo("FoodFactory", "Bread",7);
        producent.process();
        producent.inform(dto);
    }
}
