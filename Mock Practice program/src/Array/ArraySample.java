package Array;
import java.util.Arrays;
public class ArraySample 
{

	public static void main(String[] args) 
	{
		int sum;
		String b="Aspire";
		
		int c[]= {1,4,3,1,6,7};
	
		for(int i=0;i<=5;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		sum=c[1]+c[5];
		System.out.println("sum="+sum);
		
		String[]d= {"Arjun ","Ugile ","Reddy"};
		for(String r:d)
		{
			System.out.print(r);
		}
		System.out.println();
		int []e=new int[5];
		e[0]=2;
		e[1]=4;
		e[2]=5;
		e[3]=7;
		e[4]=2;
		System.out.println(e[2]);
		System.out.println(c[5]);
		System.out.println(d[1]);
		int[] v= new int[5];
		v[0]='A';
		v[1]='R';
		v[2]='J';
		v[3]='U';
		v[4]='N';
		
		System.out.println("Ascii Value Is="+v[0]);
		System.out.println("Length/size of c ="+c.length);
		System.out.println("Length/size of e ="+e.length);
		
		 Arrays.sort(c);
          for(int j=5;j>=0;j--)         // ascending order
          {
        	 System.out.print(c[j]+" ");
          }
      
			
}
		
		
		
		
		
	

}


