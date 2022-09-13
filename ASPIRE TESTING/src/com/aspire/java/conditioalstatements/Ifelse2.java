package com.aspire.java.conditioalstatements;

import java.util.Scanner;

public class Ifelse2 
{

	public static void main(String[] args) 
	{
           System.out.println("Enter your Marks:-");
            //int obtmarks=50;
            //int passmarks=45;
           int marks;
           Scanner s=new Scanner(System.in);
           marks=s.nextInt();
           
            if(marks>75&&marks<100) 
            {
            	System.out.println("Congratulations Distinction");
            }
            else
            if(marks>=60&&marks<100)
            {
            	System.out.println("Congratulations first class");
            }
            else if(marks<=35)
            {
            	System.out.println("Sorry Failed");
            	
            }
           
            else if(marks>=101)
            {
            	System.out.println("Sorry Invalid number tray again");
            }
	}
}



            
          


