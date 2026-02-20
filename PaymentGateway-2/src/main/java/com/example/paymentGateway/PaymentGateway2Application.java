package com.example.paymentGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class PaymentGateway2Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(PaymentGateway2Application.class, args);
		Payment upi = context.getBean(Upi.class);
		Payment netBanking = context.getBean(NetBanking.class);
		
		upi.pay(1000);
		netBanking.pay(10000);
	}

}
