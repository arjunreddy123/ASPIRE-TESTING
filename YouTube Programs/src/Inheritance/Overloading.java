package Inheritance;

public class Overloading
{
	int a;int b;int c;
	public int addition()
	{
		c=a+b;
		//System.out.println(c);
		return c;
	}
	public void addition(int x)
	{
		c=a+x;
		System.out.println("1 parametr "+c);
	}
	public void addition(int x,int y)
	{
		c=x+y;
		System.out.println("2 parametr "+c);
	}
	public void addition(int x,int y,double z)
	{
		double c=x+y+z;
		System.out.println("3 parametr "+c);
		
	}
	public static void main(String[] args) 
	{
		Overloading o=new Overloading();
		o.addition();
		//int add=o.addition();
		o.addition(40);
		o.addition(20,30);
		o.addition(05,15,20.1010);
		System.out.println("hi "+o.c);
	}
	

}
