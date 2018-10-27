package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private Customer customer;

    public ProductOrderService(InformationService informationService, Customer customer) {
        this.informationService = informationService;
        this.customer = customer;
    }

    private boolean isAvailable(Order order){
        int availableCopies = ProductStorage.getStorageMap().get(order.getProduct());
        if(order.getQuantity() <= availableCopies) {
            return true;
        }
        return false;
        }
    public String process(Order order){
        if(isAvailable(order)) {
            informationService.contact(customer);
            return "You just ordered " + order.getQuantity() + " copies of " + order.getProduct().getName();
        }
        return "Order not available";
    }
}