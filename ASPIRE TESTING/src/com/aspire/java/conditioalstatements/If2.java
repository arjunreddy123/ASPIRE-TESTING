package com.aspire.java.conditioalstatements;

import java.util.Scanner;

public class If2
{

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter any no::-");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		if (num%2==0)
	    {
			System.out.println("Number is even");
			
		}
		else
		{
			System.out.println("Number is odd ");
		}
		
		
	}

}
