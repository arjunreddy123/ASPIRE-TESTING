package Practice25sep;

import java.util.Arrays;

public class Aarry 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,2,0,4,5,2,5,10};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{ 
				if(a[i]==a[j])
			    System.out.print(a[i]+" ");
		    }
		    System.out.print("");
	    }

}
}