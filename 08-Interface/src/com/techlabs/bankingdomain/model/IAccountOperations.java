package com.techlabs.bankingdomain.model;

public interface IAccountOperations {

	void deposit(double amount);
	void withdraw(double amount);
	void checkbalance();
}
