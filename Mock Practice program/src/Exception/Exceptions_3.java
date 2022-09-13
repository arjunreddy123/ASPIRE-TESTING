package Exception;

public class Exceptions_3 
{

	public static void main(String[] args) 
	{
		String s="Arjun";
		try
		{
		int a=Integer.parseInt(s);
		System.out.println(a);
		System.out.println("String Exceptions");
		}
		catch(NumberFormatException n)
		{
			System.out.println("String " +s+ " Cant converted to Integer");
		}
		finally
		{
		  System.out.println("===Main Mthod End===");
		}

	}

}
