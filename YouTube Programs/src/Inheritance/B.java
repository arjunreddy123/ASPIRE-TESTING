package Inheritance;

public class B extends A
{
	
	 
	public void add()
	{  
		//super.add();
		c=a+b;
		System.out.println("B class Sum of A+B="+c);
	}
    void sub()
   {
	c=a-b;
	System.out.println("Subtraction of A&B is:"+c);
   }
    void multi()
   {
	c=a*b;
	System.out.println("Multiplication of A&B is:"+c);
   }
   void div()
   {
	c=a/b;
	System.out.println("Division of A&B is:"+c);
   }
}
