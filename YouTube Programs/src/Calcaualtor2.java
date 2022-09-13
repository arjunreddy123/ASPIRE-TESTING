import java.util.Scanner;

public class Calcaualtor2 
{

	public static void main(String[] args) 
	{
		String yn;
		do
		{
			Scanner S=new Scanner(System.in);
			System.out.println("Enter No1:");
			int no1=S.nextInt();
			System.out.println("Enter No2:");
			int no2=S.nextInt();
			int result;
			System.out.println("Select Symbol(+,-,*,/)");
			String symbol=S.next();
			
			switch(symbol)
			{
			case"+":result=no1+no2;
			System.out.println("Addition is:"+result);
			break;
			case"-":result=no1-no2;
			System.out.println("Substraction is:"+result);
			break;
			case"*":result=no1*no2;
			System.out.println("Multiplication is:"+result);
			break;
			case"/":result=no1/no2;
			System.out.println("Dividation is:"+result);
			break;
			default:System.out.println("Inavlid symbol");
		    }
			System.out.println("Do You Want to Continue(Press Y for Yes or N for No)");
         
			 yn =S.next();
		
       }	
		while(yn.equals("y") || yn.equals("y"));
		
		

	}
}

