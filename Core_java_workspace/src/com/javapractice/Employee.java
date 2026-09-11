package com.javapractice;

//Create an Employee class with:
//Instance variables: empId, empName, salary
//Static variable: companyName
//Static block to initialize companyName
//Instance block to print a message
//Create 3 objects and observe the execution order of static block, instance block.

public class Employee {
	
	static String companyName;
	static Employee e=new Employee();	
	
	int empId;
	String empName;
	int salary;
	
	
//		e.empId=1;
//		e.empName="Akhilesh";
//		e.salary=40000;
	
	{
		System.out.println("welcome to company");
	}
	
	
	static {
		companyName="ABCD";
		System.out.println(companyName);
		
	}
	
	
	
		
	
	public static void main(String[] args) {
		
		

		
	}

}
