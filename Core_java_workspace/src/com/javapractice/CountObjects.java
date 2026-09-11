package com.javapractice;

public class CountObjects {
	
	static int count=0;
	

	
	{
		count=count+1;
	}
	
	


	public static void main(String[] args) {
		
		CountObjects c = new CountObjects();
		CountObjects c1 = new CountObjects();
		CountObjects c2 = new CountObjects();
		CountObjects c3 = new CountObjects();
		System.out.println("No of Objects : "+count);
		

	}

}
