package com.capgemini_practice;

public class AtmMachine {
	private double balance;
	private static int limit = 5;
	private static double minBalance = 5000;
	private static double maxBalance = 10000;
	private int count;

	public AtmMachine(double balance) {
		this.balance = balance;
		this.count = 0;
	}
	public void withdraw(double amount) {
		try {
			if(count >= limit) {
				throw new TransactionLimitExceededException("Transaction limit exceeded");
			}

			if(amount > balance) {
				throw new InvalidWithdraw("Balance cannot be in negative");
			}

			if(balance - amount < minBalance) {
				throw new InvalidWithdraw("Minimum balance of Rs " + minBalance + " must be maintained");
			}

			if(amount > maxBalance) {
				throw new TransactionLimitExceededException("Transaction amount exceeds limit. Maximum: Rs " + maxBalance);
			}

			balance -= amount;
			count++;
			System.out.println("Withdrawal successful!");
			System.out.println("Current balance: Rs " + balance);

		} catch (InvalidWithdraw e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("Current balance: Rs " + balance);
		} catch (TransactionLimitExceededException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("Current balance: Rs " + balance);
		}
	}
}