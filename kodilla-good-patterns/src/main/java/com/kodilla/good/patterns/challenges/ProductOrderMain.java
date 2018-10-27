package com.kodilla.good.patterns.challenges;

public class ProductOrderMain {
    public static void main(String args[]){
        ProductOrderService service = new ProductOrderService(new SMSService(),new Customer("Jan Nowak","jnowak@gmail.com",606777888));
        System.out.println(service.process(OrderCreator.createOrder("Mario",2)));
    }
}
