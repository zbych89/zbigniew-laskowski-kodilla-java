package com.kodilla.good.patterns.delivery;

public class DeliveryRunner {
    Producent producent;
    public void run(Producent producent, Supplier supplier){
        DTO dto = producent.getInfo( "Bread",3);
        producent.process();
        producent.inform(dto,supplier);
    }
}
