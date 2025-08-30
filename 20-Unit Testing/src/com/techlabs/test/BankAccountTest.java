package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.techlabs.model.BankAccount;

public class BankAccountTest {

	BankAccount account;

	@BeforeEach
	public void start() {
		System.out.println("Before each test");
		account = new BankAccount(100.0);
	}

	@AfterEach
	public void end() {
		System.out.println("After each test");
	}

	@DisplayName("Deposit Tests")
	@Nested
	public class Deposit {
		@Test
		@DisplayName("Deposit negative amount should throw exception")
		public void testNegativeDeposit() {
			assertThrows(IllegalArgumentException.class, () -> account.deposit(-1));
		}

		@Test
		@DisplayName("Deposit zero amount should throw exception")
		public void testZeroDeposit() {
			assertThrows(IllegalArgumentException.class, () -> account.deposit(0));
		}

		@Test
		@DisplayName("Valid deposit should not throw exception")
		public void testValidDeposit() {
			account.deposit(50.0);
			account.getBalance();
		}
	}

	@Nested
	@DisplayName("Withdraw Tests")
	public class withdraw {
		@Test
		@DisplayName("Valid withdraw should not throw exception")
		public void testValidWithdraw() {
			account.withdraw(40.0);
			account.getBalance();
		}

		@Test
		@DisplayName("Withdraw more than balance should throw exception")
		public void testOverdraft() {
			assertThrows(IllegalArgumentException.class, () -> account.withdraw(150.0));
		}
	}

}
