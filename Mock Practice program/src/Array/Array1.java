package Array;

public class Array1 
{

	public static void main(String[] args) 
	{
		//int row=5;
		//int column=3;
		
		int a[][]=new int [5][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=1;
		a[1][1]=1;
		a[1][2]=1;
		a[2][0]=1;
		a[2][1]=1;
		a[2][2]=1;
		a[3][0]=1;
		a[3][1]=1;
		a[3][2]=1;
		a[4][0]=1;
		a[4][1]=1;
		a[4][2]=1;
		
		for(int i=0;i<=4;i++)
	{
			for(int j=0;j<=2;j++)
		{
			System.out.print(a[i][j]+" ");
		}
			System.out.println();
		}
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}

	}

}
