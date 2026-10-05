package com.javapractice;

public class DataTypeDemo2 {

	public static void main(String[] args) {
		
		
		int i=67;
		double d=78.02;
		char c='A';
		
		System.out.println("Before type casting");
		System.out.println("i:"+i);
		System.out.println("d:"+d);
		System.out.println("c:"+c);
		System.out.println("After type casting");
		
		double d1=i;
		int i1=(int)d;
		char c1=(char)i;
		int i2=(int)c;
		System.out.println("Convert double --> int (i1):"+i1);
		System.out.println("Convert char --> int (i2):"+i2);
		System.out.println("Convert int --> double (d1):"+d1);
		System.out.println("Convert int --> char (c1):"+c1);
		
//		boolean b1=true;
//		boolean b2=false;
//		boolean b3=True;
//		boolean b4=False;
//		boolean b5=0;
//		boolean b6=1;

	}

}
