package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    int Id;
    String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID",unique = true)
    public int getId() {
        return Id;
    }
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
