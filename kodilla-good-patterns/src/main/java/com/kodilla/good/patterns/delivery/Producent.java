package com.kodilla.good.patterns.delivery;

public interface Producent {
    void process();
    int getLimit();
    default DTO getInfo(String product,int quantity){
        return new DTO(new Product(product),quantity);
    }
    default void inform(DTO dto,Supplier supplier){
        if(dto.getQuantity()<=this.getLimit()){
            System.out.println("Products taken from supplier: " + supplier.getName());
            System.out.println("Ordered " + dto.getProduct()  + ". Quantity = " + dto.getQuantity());
            System.out.println("Order success");
        }
        else{
            System.out.println("Order failure");
        }
    }
}
