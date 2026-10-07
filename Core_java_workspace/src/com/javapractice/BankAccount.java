package com.javapractice;

public class BankAccount {

	static int Balance=1000;
	
	int Deposit(int amount) {
		Balance=Balance+amount;
		return Balance;
	}
	
	int Withdraw(int amount) {
		Balance=Balance-amount;
		return Balance;
	}
	
	public static void main(String[] args) {
		
		BankAccount B = new BankAccount();
		
		B.Deposit(500);
		B.Withdraw(300);
		System.out.println("Remaining Balance Amount : "+Balance);
	
		
	}

}
