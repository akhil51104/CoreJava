package com.javapractice;
import java.util.Scanner;
//1. You are going to a shop to buy chocolates and cookies.
//Each chocolate costs ₹15
//Each cookie costs ₹10
//You have ₹450 in total
//If you decide to buy 10 chocolates and 5 cookies, 
//write a Java program to calculate how much money will remain after your purchase.


public class Practice5 {
	
	
	
	static int ChocolatePrice=15;
	static int CookiePrice=10;
	
	static int TotalChocolates;
	static int TotalCookies;
	static int Total;
	static int Spending=0;
	static int Remaining;
	
	static void Purchase(int TotalChocolates,int TotalCookies) {
		 Spending=TotalChocolates*ChocolatePrice+TotalCookies*CookiePrice;
		 Remaining=Total-Spending;
	}
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Total Money : ₹");
		Total=sc.nextInt();
		System.out.print("TotalChocolates : ₹");
		int readChocolateCount=sc.nextInt();
		System.out.print("TotalCookies : ₹");
		int readCookieCount=sc.nextInt();
		
		
		Purchase(readChocolateCount,readCookieCount);
		System.out.println("Remaining money after purchase is ₹"+Remaining);
		
		sc.close();
	}

}
