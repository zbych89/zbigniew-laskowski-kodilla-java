package com.kodilla.good.patterns.delivery;

public class SupplierDTO {
    private Supplier supplier;
    private Product product;
    private int quantity;

    public SupplierDTO(Supplier supplier, Product product, int quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
