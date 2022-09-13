package Casting;

public class sample 
{

	public static void main(String[] args) 
	{
		//implcit casting 
		byte b=100;
		int i=b;
		long l=b;
		System.out.println(l);
		//explicit casting in explicit castig data loss may take place
		int a=10000;
		byte c=(byte) a;
		System.out.println(c);

	}

}
