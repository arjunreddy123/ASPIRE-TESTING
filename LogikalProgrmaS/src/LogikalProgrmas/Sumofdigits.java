package LogikalProgrmas;
import java.util.Scanner;

public class Sumofdigits 
{

	public static void main(String[] args) 
	{   
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any Number To get sum of its didgit:");
		int num=s.nextInt();
		int sum=0;
//		
//		while(num>0)
//		{
//			sum=sum+num%10;
//			num=num/10;
//		}
		for(int i=0;i<=num;i++)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);	
		
	}

}
