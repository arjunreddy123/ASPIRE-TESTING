import java.util.Scanner;

public class calculator 
{

	public static void main(String[] args) 
	{
		int a,b,c,choice;
		System.out.print("Enter Any Two Numbers:-");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter Your Choice:-");
		choice=s.nextInt();
		
		switch (choice)
		{
		case 1:c=a+b;
		System.out.println("ADDITION:=" +c);
		break;
		
		case 2:c=a-b;
		System.out.print("SUBSTRACTION:= " +c);
		break;
		
		case 3:c=a*b;
		System.out.print("MULTIPLICATION:= " +c);
		break;
		
		case 4:c=a/b;
		System.out.print("DIVISION:=" +c);
		break;
		
		
		default:
		System.out.print("INVALID CHOICE...");
		
		}
		

	}

}
