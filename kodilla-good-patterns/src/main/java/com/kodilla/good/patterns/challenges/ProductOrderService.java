package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public String process(Order order){
        return "You just ordered " + order.getQuantity() + " copies of " + order.getProduct().getName();
    }
}
