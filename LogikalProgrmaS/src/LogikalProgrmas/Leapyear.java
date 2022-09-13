package LogikalProgrmas;
import java.util.Scanner;

public class Leapyear 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter Year..");
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		if (year%4==0)
		{
			System.out.println("This is leap year..");
			
		}
		else
		{
			System.out.println(" This is Not a Leap year");
		}
		System.out.println("*Thank You*");

	}

}
