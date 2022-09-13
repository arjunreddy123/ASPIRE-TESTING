import java.util.Scanner;

public class If_demo 
{

	public static void main(String[] args) 
	{

//int num1;
//int num2;
//int num3;

//System.out.println("Enter Any Three No.");
Scanner s=new Scanner(System.in);
System.out.print("Enter No-1:");
int num1=s.nextInt();
System.out.print("Enter No-2:");
int num2=s.nextInt();
System.out.print("Enter No-3:");
int num3=s.nextInt();

if(num1>num2)
	if(num1>num3)
		System.out.println("The Gretest No."+num1);
if(num2>num3)
	if(num2>num1)
		System.out.println("The Gretest No."+num2);
if(num3>num1)
	if(num3>num2)
		System.out.println("The Gretest No Is:"+num3);
		
	
	}

}
