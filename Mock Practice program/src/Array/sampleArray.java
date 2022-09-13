package Array;

public class sampleArray 
{

	public static void main(String[] args) 
	{
		int a[][]=new int [3][4];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[0][3]=4;
		a[1][0]=5;
		a[1][1]=6;
		a[1][2]=7;
		a[1][3]=8;
		a[2][0]=9;
		a[2][1]=0;
		a[2][2]=6;
		a[2][3]=6;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	
		
		

	}

}
