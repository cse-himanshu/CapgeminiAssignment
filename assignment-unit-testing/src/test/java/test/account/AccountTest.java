package test.account;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import test_bank.AccountService;

public class AccountTest {
	AccountService service;
	
	@BeforeEach
	void setup() {
		service = new AccountService();
	}
	
	@Test
	void depositAmount() {
		assertEquals(6000, service.deposit(3000));
	}
	
	@Test
	void withdraw() {
		assertEquals(1000, service.withdraw(2000));
	}
}
