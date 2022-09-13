package Exception;

public class Exceptions_2 
{

	public static void main(String[] args) 
	{
		try 
		{
	        int a=10,b=0,c;
	        c=a/b;
	        System.out.println(c);
		}
		catch(ArithmeticException e) // here we can write simply Exception its super class of exception
		{
			System.out.println("We cant divide by zero");
		}
		finally
		{
			System.out.println("===Main Method End===");
		}
	

	}

}
