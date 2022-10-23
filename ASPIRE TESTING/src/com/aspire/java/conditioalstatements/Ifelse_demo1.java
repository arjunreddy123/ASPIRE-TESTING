package com.aspire.java.conditioalstatements;

import java.util.Scanner;

public class Ifelse_demo1 
{

	public static void main(String[] args) 
	{
		int input;
		System.out.println("Input Number:");
		Scanner s=new Scanner(System.in);
		
		input=s.nextInt();
		if(input>10)
		{
			System.out.println("Number is Positive:");
		}
		else if(input<5&&input>=1)
		{
			System.out.println("Number is Negitive");
		}
		else
		{
			System.out.println("Number Zero");
		}
      

	}

}
