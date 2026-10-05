package com.javapractice;

public class Practice4 {

		static Practice4 p = new Practice4();
		
		public static void hello1() {
			System.out.println("Static hello 1");
		}
		
		public static void hello2() {
			System.out.println("Static hello 2");
		}
		
		public static void hello3() {
			System.out.println("Static hello 3");
		}
		
		
		public void hello4() {
			System.out.println("Instance hello 4");
		}
		
		public void hello5() {
			System.out.println("Instance hello 5");
		}
		
		static {
			Practice4.hello1();
			Practice4.hello2();
			Practice4.hello3();
			p.hello4();
			p.hello5();
			
		}
		
				
		
	
	public static void main(String[] args) {
		

	}

}
