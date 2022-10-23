package com.aspire.java.conditioalstatements;

import java.util.Scanner;

public class Nestedif_else 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter age:--");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		//String gender ="male";
		if (age>=18 ) 
		{
			System.out.println("The person is valid for voter");
		}
	   else
		{
				System.out.println("The person is Having invalid marriage age");
		}
	}
}
		
	
		
	


		


