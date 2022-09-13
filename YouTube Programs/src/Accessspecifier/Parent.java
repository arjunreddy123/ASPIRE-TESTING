package Accessspecifier;

public class Parent 
{
int a=20;
int b=10;
int c;
public void method() 
{
	c=a+b;
	System.out.println("Public Method="+c);
}
protected void method1()
{
	c=a-b;
	System.out.println("Protected method="+c);
}
private void method2() 
{
	c=a*b;
	System.out.println("Private method="+c);
}
void method3() 
{
	c=a/b;
	System.out.println("Default method="+c);
}
}
