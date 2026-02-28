package com.capgemini_practice;

public class TransactionLimitExceededException extends Exception{
	public TransactionLimitExceededException(String message) {
		super(message);
	}
}
