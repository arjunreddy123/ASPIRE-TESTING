package practiceprogram;

public class practicefib
{

	public static void main(String[] args) 
	{
		int num=111;
		int reminder;
		int reverse = 0;
		int temp=num;
		
		while(num>0)
		{
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
		}
		System.out.println(reverse);
		
		
		
		if(temp==reverse)
		{
			System.out.println("number is palindrom");
		}
		else
		{
			System.out.println("number is not palindrom");
		}
		
	}

}
