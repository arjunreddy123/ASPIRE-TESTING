import java.util.Scanner;

public class Nestedifelsedemo 
{

	public static void main(String[] args) 
	{
		System.out.print("Enter Number:");
		Scanner s=new Scanner (System.in);
         int day=s.nextInt();
         
        if(day==1)
      {
	System.out.print("DAY IS SUNDAY");
      }
     else if(day==2)
    {
	System.out.print("DAY IS MONDAY");
     }
     else if (day==3)
     {
    	 System.out.print("DAY IS TUESDAY");
    	 
     }
     else if(day==4)
     {
    	 System.out.print("DAY IS WENSDAY");
     }
     else if(day==5)
     {
    	 System.out.print("DAY IS THURSADAY");
     }
     else if(day==6)
     {
    	 System.out.print("DAY IS FRIDAY");
    	 
     }
     else 
     {
    	 System.out.print("DAY IS SATURDAY");
     }
	}

}
