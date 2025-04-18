package com.example.test_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringBootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TestSpringBootApplication.class, args);

		var orderService = new OrderService(new BPaymentService()); //kan vara annan ifall men behöver byta
		orderService.placeOrder(); //kallar på funktion från APaymentService
	}

}
