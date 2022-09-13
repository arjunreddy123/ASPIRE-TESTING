import java.util.Scanner;

public class Day_of_week
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the Number:");
		Scanner obj=new  Scanner(System.in);
		int day=obj.nextInt();
		if(day==1)
		{
			System.out.print("DAY IS SUNDAY:");
			
		}
		else if(day==2)
		{
			System.out.print("DAY IS MONDAY:");
		}
		else if(day==3)
		{
			System.out.print("DAY IS TUESDAY:");
		}
		else if(day==4)
		{
			System.out.print("DAY IS WENSDAY:");
		}
		else if(day==5)
		{
			System.out.print("DAY IS THURSDAY:");
		}
		else if (day==6)
		{
			System.out.print("DAY IS FRIDAY:");
		}
		else if(day==7)
		{
			System.out.print("DAY IS SATURDAY:");
		}
		else
		{
			System.out.print("Sorry Invalid Number:");
		}
		

	}



 }
