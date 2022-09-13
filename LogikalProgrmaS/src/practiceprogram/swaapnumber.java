package practiceprogram;

public class swaapnumber 
{

	public static void main(String[] args) 
	{
		//using third varble
		int a=10;int b=20;int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a+" "+b);
	  //without using third varible	
		a=a+b;
		a=a-b;
		b=a-b;
		System.out.println("a="+a+" "+"b="+b);

	}

}
