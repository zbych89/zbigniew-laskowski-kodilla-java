package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService {
    public void contact(Customer customer){
        System.out.println("Email with order details sent to " + customer.getEmail());
    }
}
