package com.aspire.java.conditioalstatements;

import java.util.Scanner;

public class If_A 
{

	public static void main(String[] args) 
	{
		 System.out.print("Enter a value:");
		 
		 Scanner S = new Scanner(System.in);
		
		 int x = S.nextInt();
		 if (x > 10) 
		 {
		 System.out.println("The value is positive:");
		 }
		 else 
		 {
		 if (x < 10) 
		 {
		 System.out.println("The value is Negitive:");
		 } else 
		 {
		 System.out.println("The value is zero:");
		 }
		 }
		 System.out.println("Good Bye..");
		 }


	}


