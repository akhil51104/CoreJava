package com.javapractice;

/*
Question: Create a class Account with three instance variables Accno`, name`, salary and
 one static variable accountNoGenerater. Use an instance initializer block to auto-generate account numbers. 
 For every new object created, the static variable should be incremented and its value should be assigned to 
 the instance variable Accno
*/

public class Account {
	
	static int accountNoGenerater=124;
	int Accno;
	String name;
	int salary;
	
	{
		accountNoGenerater++;
		Accno=accountNoGenerater;
	}
	
	
	public static void main(String[] args) {
		
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		Account a4 = new Account();
		
		System.out.println("Account Number "+a1.Accno);
		System.out.println("Account Number "+a2.Accno);
		System.out.println("Account Number "+a3.Accno);
		System.out.println("Account Number "+a4.Accno);
		

	}

}
