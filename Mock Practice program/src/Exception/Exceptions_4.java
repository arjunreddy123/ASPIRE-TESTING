package Exception;

public class Exceptions_4 
{

	public static void main(String[] args) 
	{
		String s="Arjun";
		try 
		{
		   int a=Integer.parseInt(s);
		   System.out.println(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println("String " +s+ " Cant converted to Integer");
		}
		
	}
	
}

