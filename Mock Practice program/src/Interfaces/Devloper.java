package Interfaces;

import java.util.Scanner;

public class Devloper implements Client
{
	String name;
	double salary;
	
	public void input() 
	{
		System.out.println("Enter user Name:");
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
		System.out.println("Enter user salary:");
		salary=s.nextDouble();
	}

  public void ouput() 
	{
		System.out.println("User Name="+name + " \n" +"Salary Is=" +salary);
		//System.out.println(name+" "+salary);
		
	}
    public static void main(String[] args) 
    {
    	Devloper c=new Devloper();
    	c.input();
    	c.ouput();
	
    }
}
