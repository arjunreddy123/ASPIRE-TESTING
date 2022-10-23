import java.util.Scanner;

public class condition_if 
{

	public static void main(String[] args) 
	{
		int pwd;
		System.out.println("ENTR MY PASSWORD:=");
		Scanner s=new Scanner(System.in);
	    pwd=s.nextInt();
	    if(pwd==1966) 
	     
		{
			System.out.println("MY NAME:-ARJUN REDDY");
			System.out.println("MY AGE:-34");
			System.out.println("MY MOBILE NO=7775977766");
			System.out.println("MY ADDRES=UDGIR");
		}
	    else 
	    {
	    	System.out.print("Sorry Wrong Password");
	    }
	    

	}

}
