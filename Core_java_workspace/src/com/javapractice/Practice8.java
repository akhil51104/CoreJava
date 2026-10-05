package com.javapractice;

public class Practice8 {
	
	int Total;
	float Avg;
	
	void StudentDetails(String StdName,int RollNo,String Course,String sub1,String sub2,String sub3,int sub1Marks,int sub2Marks,int sub3Marks) {
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
	
	int Total(int sub1Marks,int sub2Marks,int sub3Marks) {
		
		Total=sub1Marks+sub2Marks+sub3Marks;
		return Total;
	}
	
	float Average(int Total) {
		Avg = Total/3;
		return Avg;
	}
	
	public static void main(String[] args) {
		
		Practice8 s1 = new Practice8();
		s1.StudentDetails("Akhil",8423,"Btech","Mathematics 1","BEEE","C Language",78,67,84);
		System.out.println(s1.Total(78, 67, 84));
		System.out.println(s1.Average(s1.Total));
		
		
	}

}
