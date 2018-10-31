package com.kodilla.good.patterns.delivery;

public class DTO {
    private Product product;
    private int quantity;

    public DTO(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
