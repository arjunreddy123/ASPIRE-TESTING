package Array;

public class Practice 
{

	public static void main(String[] args) 
	{
		int row=3;
		int column=4;
		int a[][]= {{1,1,1,1},{5,5,5,5},{7,7,7,7}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
