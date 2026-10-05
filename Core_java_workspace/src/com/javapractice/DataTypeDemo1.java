package com.javapractice;

public class DataTypeDemo1 {

	Integer StudentId;
	String Name;
	Integer Age;
	Double Marks;
	Character Grade;
	Boolean Passed;
	
	public static void main(String[] args) {
		DataTypeDemo1 d = new DataTypeDemo1();
		
		d.StudentId=1102;
		d.Name="Vick";
		d.Age=30;
		d.Marks=70d;
		d.Grade='B';
		d.Passed=true;
		
		System.out.println("Student Id :"+d.StudentId);
		System.out.println("Student Name :"+d.Name);
		System.out.println("Student Age :"+d.Age);
		System.out.println("Student Marks :"+d.Marks);
		System.out.println("Student Grade :"+d.Grade);
		System.out.println("Student Passed :"+d.Passed);
		

	}

}
