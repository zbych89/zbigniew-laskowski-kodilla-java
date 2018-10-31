package com.kodilla.good.patterns.delivery;

public interface Producent {
    void process();
    int getLimit();
    default ProductDTO getInfo(String product,int quantity){
        return new ProductDTO(new Product(product),quantity);
    }
    default void inform(ProductDTO dto,Supplier supplier){
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
