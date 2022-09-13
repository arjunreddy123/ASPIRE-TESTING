import java.util.Scanner;

public class Day_of_week2 {

	
		public static void main(String[] args) 
		{
			System.out.print("Enter Number:");
			Scanner s=new Scanner (System.in);
	         int day=s.nextInt();
	         switch(day)
	         {
	         case 1: System.out.print("DAY IS SUNDAY:");
	         break;
	       
	         case 2: System.out.print("DAY IS MONDAY:");
	         break;
	         
	         case 3: System.out.print("DAY IS TUESDAY:");
	         break;
	         
	         case 4: System.out.print("DAY IS WENSDAY:");
	         break;
	         
	         case 5: System.out.print("DAY IS THURSDAY:");
	         break;
	         
	         case 6: System.out.print("DAY IS FRIDAY:");
	         break;
	         default:System.out.print("DAY IS SATURDAY:");
	        
	         }

	}

}
