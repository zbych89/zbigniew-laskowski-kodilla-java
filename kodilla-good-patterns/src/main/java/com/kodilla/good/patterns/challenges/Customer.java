package com.kodilla.good.patterns.challenges;

public class Customer {
    private String name;
    private String email;
    private int phoneNumber;

    public Customer(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
