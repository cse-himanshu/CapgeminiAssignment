package com.capgemini_practice;

public class Main {
	public static void main(String[] args){
		AtmMachine atm = new AtmMachine(100000);
		atm.withdraw(1000);
		atm.withdraw(1000);
		atm.withdraw(1000);		
		atm.withdraw(1000);
		atm.withdraw(1000);
		atm.withdraw(1000);
	}
}
