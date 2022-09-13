package LogikalProgrmas;
import java.util.Scanner;

public class SwapTwoNumbers 
{

	public static void main(String[] args) 
	{    
		//SWAP TWO NUMBERS ITHOUT USING THIRD VARIABLES
		Scanner s=new Scanner(System.in);
		System.out.println(("Enter Any TWo Nyumber.."));
		int a=s.nextInt();
		int b=s.nextInt();
		
		a=a+b;   //a=30
		b=a-b;   //b=10
        a=a-b;   //a=20
        System.out.println("A-"+a);
        System.out.println("B-"+b);
        
        //OR using third varibales
        
        // int a=10,b=20;
        // int t;
        //t=a;
        //a=b;
        //b=t;
        
	}

}
