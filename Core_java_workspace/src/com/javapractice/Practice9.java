package com.javapractice;

public class Practice9 {
	
	static int sum;
	static int prod;
	static int sub;
	static int div;
	static char c;
	
	int addition(int a,int b) {
		return sum=a+b;
	}
	
	int subtraction(int a,int b) {
		return sub=a-b;
	}

	
	int multiplication(int a, int b) {
		return prod=a*b;
	}
	
	int division(int a,int b) {
		return div=a/b;
	}
	

	
	
	public static void main(String[] args) {
		
		Practice9 p=new Practice9();
		
		int a=p.addition(10,20);
		int s=p.subtraction(10,20);
		int m=p.multiplication(10, 20);
		int d=p.division(10,20);
		
		System.out.println("Addition: "+a);
		System.out.println("Subtraction: "+s);
		System.out.println("Multiplication: "+m);
		System.out.println("Division: "+d);
		
		
		
	}

}
