package com.example.test_spring_boot;

public class BPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL"); 
        System.out.println("Amount: " + amount);
    }

}
