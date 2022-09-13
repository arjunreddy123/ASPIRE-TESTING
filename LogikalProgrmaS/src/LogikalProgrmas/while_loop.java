package LogikalProgrmas;
import java.util.Scanner;

public class while_loop 
{

	public static void main(String[] args) 
	{
		
		int num;
		System.out.print("Enter Any No:-");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		//while(num>=0)
			
		{
			if(num%2==0)
			{
				System.out.println("Even No...");
				//break;
			
			}
			else
			{
				System.out.println("Odd NO...");
		        //break;
			}
		}
		
		System.out.println("While Loop Ended:");
		
		}
	
}
