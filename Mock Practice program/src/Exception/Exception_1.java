package Exception;

public class Exception_1 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b=0;
		int c=10;
		double d=0;
		//System.out.println(a[10]/b);
		try 
		{
			d=(float)a[7]/c;
			System.out.println("d="+d );
		try
			{
			System.out.println(c/b);
		    }
		catch(ArithmeticException er)
		    {
			System.out.println("Please do not use zero value for division");
		    }
		catch(Exception e)
		    {
			System.out.println("other all exceptions");
		    }
		finally
		    {
			System.out.println("finaaly inner Block exicuted");
		    }
		}
		catch(ArrayIndexOutOfBoundsException ari)
		{
			System.out.println("Array Index incorrect");
		}
		catch(Exception e)
		{
			System.out.println("other all exceptions ss");
		}
			
		finally
		{
			System.out.println("Outer finally Block exicuted");
		}
		
		}
	

	}


