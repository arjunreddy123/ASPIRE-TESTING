package com.aspire.java.conditioalstatements;

import java.util.Scanner;

public class If3 
{

	public static void main(String[] args) 
	{
		int a;
		int b;
		System.out.println("Enter Any Two No:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		
		if(a>b)
		{
			System.out.println("A greather than B");
			
		}
		else 
		{
			System.out.println("B is Greater Than A");
		}
		
	}

}
