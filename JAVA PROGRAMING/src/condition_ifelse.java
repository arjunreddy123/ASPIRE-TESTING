import java.util.Scanner;

public class condition_ifelse {

	public static void main(String[] args) 
	{

		int pwd;
		System.out.print("ENTR MY PASSWORD:=");
		Scanner obj=new Scanner(System.in);
	     pwd=obj.nextInt();
	     if(pwd==1966) 
	     
		{
			System.out.println("MY NAME:-ARJUN REDDY");
			System.out.println("MY AGE:-34");
			System.out.println("MY MOBILE NO=7775977766");
			System.out.println("MY ADDRES=UDGIR");
		}
	     else 
	     {
	    	 System.out.println("SORRY WRONG PASSWORD...");
	    	 
	     }

	}

}
