package com.kodilla.good.patterns.challenges;

public class SMSService implements InformationService {
    @Override
    public void contact(Customer customer) {
        System.out.println("SMS with order details sent to number " + customer.getPhoneNumber());
    }
}
