package com.javapractice;

public class Practice3 {
		static void flying() {
			Practice3 p4 = new Practice3();
		}
	public static void main(String[] args) {
		
		Practice3 p1 = new Practice3();
		
		System.out.println(p1);
		
		p1=null;
		Practice3 p2 = new Practice3();	
		Practice3 p3 = new Practice3();
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("------------------------------------");
		p2=p3;
		System.out.println(p2);
		System.out.println(p3);
		
		flying();
		new Practice3().flying();;
		
		System.gc();
	}

}
