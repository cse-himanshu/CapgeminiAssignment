package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public Car() {
		System.out.println("Car Object is created.");
	}
	
	@Override
	public void run() {
		System.out.println("Car running...");
	}
}
