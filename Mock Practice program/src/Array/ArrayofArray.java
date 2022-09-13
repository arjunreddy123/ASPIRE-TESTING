package Array;

public class ArrayofArray 
{

	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3,4,5,6,7},
				    {5,6,7,8,9},
				    {9,9,5,15,20,30,40}};	               
		System.out.println("printing int[][] a Array=");
		for(int i=0;i<a.length;i++)	//rows
		{
			for(int j=0; j<a[i].length; j++) //column
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
			
		}
		

	}

}
