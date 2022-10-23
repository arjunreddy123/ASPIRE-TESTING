package Practicepack;

public class Arrayoddeven
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7};
		
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println("Number is Even="+value);
			}
			else
			{
				System.out.println("\nNumber is Odd="+value);
			}
		}

	}

}
