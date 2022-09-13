package com.aspire.java.conditioalstatements;

public class NestedifDemo 
{

	public static void main(String[] args)
	{
		int i=10;
		if(i==10)
		{
			if(i>15)
			{
			System.out.println("i is Smaller than 15");
			
			}
			if (i<12)
			{
				System.out.println("i is Smaller than 12");
			}
			else
			{
				System.out.println("i is Greater than 15");
			}
		}
		
		

	}

}
