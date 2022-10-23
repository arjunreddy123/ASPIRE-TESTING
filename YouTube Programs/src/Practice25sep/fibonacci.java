package Practice25sep;

public class fibonacci 
{

	public static void main(String[] args) 
	{
	    System.out.println("fibonacii serirs");
	    int a=0,b=1,c;
	    System.out.print(a+" "+b );
        for(int i=0;i<=10;i++)
        {
        	c=a+b;
        	System.out.print("," +c);
        	a=b;
        	b=c;
        }
	}

}
