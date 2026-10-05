package com.javapractice;

public class Practice7 {
	
	String StdName;
	int RollNo;
	String Course;
	String sub1;
	String sub2;
	String sub3;
	int sub1Marks;
	int sub2Marks;
	int sub3Marks;
	int Total;
	float Avg;
	
	void StudentDetails() {
		System.out.println("Student Name : "+StdName);
		System.out.println("Student RollNo : "+RollNo);
		System.out.println("Course : "+Course);
		System.out.println("Subject 1 : "+sub1);
		System.out.println("Subject 2 : "+sub2);
		System.out.println("Subject 2 : "+sub3);
		System.out.println("Subject 1 marks : "+sub1Marks);
		System.out.println("Subject 2 marks : "+sub2Marks);
		System.out.println("Subject 3 marks : "+sub3Marks);
	}
	
	int Total() {
		
		Total=sub1Marks+sub2Marks+sub3Marks;
		return Total;
	}
	
	float Average() {
		Avg = Total/3;
		return Avg;
	}
	
	public static void main(String[] args) {
		
		Practice7 s1 = new Practice7();
		s1.StdName="Student1";
		s1.RollNo=1;
		s1.Course="Btech";
		s1.sub1="Mathematics 1";
		s1.sub2="BEEE";
		s1.sub3="English";
		s1.sub1Marks=80;
		s1.sub2Marks=87;
		s1.sub3Marks=74;
		s1.StudentDetails();
		System.out.println("Total Marks : "+s1.Total());
		System.out.println("Average : "+s1.Average());

	}

}
