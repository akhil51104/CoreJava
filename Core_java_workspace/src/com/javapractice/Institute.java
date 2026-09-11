package com.javapractice;
/*
Task: Create a Java class Institute with the following requirements:
Declare a static variable TrainerName1.
Declare a static variable TrainerName2.
Declare an instance variable Employee Name, EmployeetId, EmployeeDesignation.
Assign values to both variables.
Create an  5 object of the Institute class.
 */
public class Institute {
	
	static String TrainerName1="ABCD";
	static String TrainerName2="XYZ";
	
	String EmployeeName;
	int EmployeeId;
	String EmployeeDesignation;
	
	
	public static void main(String[] args) {
		Institute e1 = new Institute();
	
		e1.EmployeeName="Akhilesh";
		e1.EmployeeId=1;
		e1.EmployeeDesignation="IT";
		
		Institute e2 = new Institute();
		
		e2.EmployeeName="Mark";
		e2.EmployeeId=2;
		e2.EmployeeDesignation="AI";
		
		System.out.println("TrainerName1:"+TrainerName1);
		System.out.println("TrainerName2:"+TrainerName2);
		System.out.println("Employeee Name:"+e1.EmployeeName);
		System.out.println("Employee ID:"+e1.EmployeeId);
		System.out.println("Employee Designation"+e1.EmployeeDesignation);
		System.out.println();
		System.out.println("TrainerName1:"+TrainerName1);
		System.out.println("TrainerName2:"+TrainerName2);
		System.out.println("Employeee Name:"+e2.EmployeeName);
		System.out.println("Employee ID:"+e2.EmployeeId);
		System.out.println("Employee Designation"+e2.EmployeeDesignation);
		
	}

}
