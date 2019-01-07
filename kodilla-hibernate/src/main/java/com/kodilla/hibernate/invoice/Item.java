package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {
    private int Id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item() {
    }

    public Item(Product product, BigDecimal price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = price.multiply(new BigDecimal(quantity));
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID",unique = true)
    public int getId() {
        return Id;
    }
    @ManyToOne(
            targetEntity = Product.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public Product getProduct() {
        return product;
    }
    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }
    @NotNull
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }
    @Transient
    public BigDecimal getValue() {
        return value;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INVOICES_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

}
