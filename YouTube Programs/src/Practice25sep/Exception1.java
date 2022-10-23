package Practice25sep;

public class Exception1 
{
	public static void main(String[] args) 
	{
		int a=10;int b=0;
		int c;
		int arr[]=new int[] {1,2,3,4,5};
		try
		{
		c=a/b;
		
		}
		
	    catch(ArithmeticException e)
		{
			System.out.println("Zero cant divided by number");
		}
		try
		{
		arr[6]=10;
		}
		
		catch( ArrayIndexOutOfBoundsException c1)
		{
			System.out.println("Array out of index");
		}
		catch(Exception a1)
		{
			System.out.println("Scecond block");
		}
		finally
		{
			System.out.println("Thank You");
		}
		
	}

}
