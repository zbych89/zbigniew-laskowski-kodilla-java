package com.kodilla.good.patterns.delivery;

public interface Producent {
    void process();
    int getLimit();
    default SupplierDTO getInfo(String supplier,String product,int quantity){
        return new SupplierDTO(new Supplier(supplier),new Product(product),quantity);
    }
    default void inform(SupplierDTO dto){
        if(dto.getQuantity()<=this.getLimit()){
            System.out.println("Ordered " + dto.getProduct() + " from " + dto.getSupplier() + ". Quantity = " + dto.getQuantity());
            System.out.println("Order success");
        }
        else{
            System.out.println("Order failure");
        }
    }
}
