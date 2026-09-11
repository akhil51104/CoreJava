package com.javapractice;

public class Practice1 {
	
	static String collegeName="ABCD"; 
	
	String StudentName;
	int StudentId;
	int StudentMarks;
	
	
	public static void main(String[] args) {
		
		Practice1 s=new Practice1();
		s.StudentId=1;
		s.StudentName="Mark";
		s.StudentMarks=78;
		
		System.out.println("College Name "+collegeName);
		System.out.println("Student ID "+s.StudentId);
		System.out.println("Student Name "+s.StudentName);
		System.out.println("Student Marks "+s.StudentMarks);
		
	}

}
