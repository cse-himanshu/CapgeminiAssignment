package com.example.paymentGateway;

import org.springframework.stereotype.Component;

@Component
public class Upi implements Payment{
	@Override
	public void pay(int amount) {
		System.out.println(amount + " payed by UPI.");
	}
}
