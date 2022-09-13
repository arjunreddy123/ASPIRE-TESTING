package LogikalProgrmas;
import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter Any Number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		int reverse =0;
		int reminder;
		while(num>0)
		{
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
		}
        System.out.print(reverse);
//        for(int i=0;i<num;i++)
//        {
//        	reminder=num%10;
//        	reverse=reverse*10+reminder;
//        	num=num/10;
//        }
//        System.out.println(reverse);
        
	}

}
