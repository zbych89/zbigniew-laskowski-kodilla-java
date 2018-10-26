package com.kodilla.good.patterns.challenges;

public class ProductOrderMain {
    public static void main(String args[]){
        ProductOrderService service = new ProductOrderService();
        System.out.println(service.process(new Order(new Game("PacMan"),3)));
    }
}
