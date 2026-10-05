package com.javapractice;


//Java :-
//Create a Student class using:
//
//* Static Block – Print college name.
//* Instance Block – Print "Student object created".
//* Instance Method – Display student details.
//* Static Method – Display college details.
//* Create 2 Student objects in main() and call all methods.
//* Student fields: rollNo, name, marks.

public class Student {
	
	int rollNo;
	String name;
	int marks;
	
	static{
		System.out.println("kvl institute of engineering");
	}
	
	
	{
		System.out.println("Student object created");
	}
	
	void studentDetails() {
		
		System.out.println("Student Name : "+name);
		System.out.println("Rollno : "+rollNo);
		System.out.println("Marks : "+marks);
		System.out.println("-----------------------");
	}
	
	static void collegeDetails() {
		System.out.println("kvl institute of engineering");
		System.out.println("Kphb colony,Hyderabad");
	}
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.rollNo=2251;
		s1.name="Nick";
		s1.marks=87;
		Student s2 = new Student();
		s2.rollNo=2252;
		s2.name="Vick";
		s2.marks=57;
		
		collegeDetails();
		s1.studentDetails();
		s2.studentDetails();

	}

}
