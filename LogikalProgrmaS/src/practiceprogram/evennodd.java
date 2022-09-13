package practiceprogram;

import java.util.Scanner;

public class evennodd {

	public static void main(String[] args) 
	{
		System.out.print("Enter any number:=");
		Scanner s=new Scanner (System.in);
		long num=s.nextLong();
		
		
		if(num%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}

	}

}
