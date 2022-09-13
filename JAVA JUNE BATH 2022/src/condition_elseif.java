import java.util.Scanner;

public class condition_elseif 
{

	public static void main(String[] args) 
	{
		int marks;
		System.out.print("ENTER MARKS:=");
		
		Scanner s=new Scanner(System.in);
		marks=s.nextInt();
		
		if(marks>=60&&marks<=100)
		{
			System.out.print("First Division...");
		}
		else if(marks>=45&&marks<=60)
		{
			System.out.print("second Division...");
		}
		else if(marks>=33&&marks<=45)
		{
			System.out.print("THIRD Division...");
		}
		else 
		{
			System.out.print("FAILD");
		}

	}

}
