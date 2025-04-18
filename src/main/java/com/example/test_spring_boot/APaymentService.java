package com.example.test_spring_boot;

public class APaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Amount: " + amount);
        System.out.println("STRIPE"); 
    }

}
