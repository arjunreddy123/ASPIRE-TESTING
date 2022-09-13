package LogikalProgrmas;
import java.util.Scanner;

public class Evennum 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Lowest Number:");
		int a=s.nextInt();
		System.out.println("Enter Second Higest Number:");
		int b=s.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
//			else
//			{
//				System.out.println("number is odd");
//			}
		}
		
				

	}

}
