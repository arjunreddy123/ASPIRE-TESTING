package com.aspire.java.Constructor;

public class sample 
{

	int a;//instance non-static varibale
	int b;
	sample()
	{
		a=50;
		b=100;
		
	}
	sample(int c,int d)
	{
		a=c;
		b=d;
		
	}
	public void addition()
	{
		int add=a+b;
		System.out.println("Addition of A&B is:"+add);
		
	}
	public void multiplication()
	{
		int multi=a*b;
		System.out.println("multication of A&b is:"+multi);
	}
	
	
	public static void main(String[] args) 
	{
		
		sample object1=new sample();
		object1.addition();
		object1.multiplication();
		
		sample object2=new sample(10,20);
		object2.addition();
		object2.multiplication();
		

	}

}
