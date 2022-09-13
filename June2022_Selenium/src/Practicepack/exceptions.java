package Practicepack;

public class exceptions 
{

	public static void main(String[] args) 
	{
		int a=10,b=0,c;
		try 
		  {
			c=a/b;
			System.out.println(c);
		  }
		catch(Exception e)
		{
			System.out.println("cant didvde by zero arthmatci exceptoon occuer");
		}
		finally
		{
			System.out.println("thank you");
		}
	

	}

}
