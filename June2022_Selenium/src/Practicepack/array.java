package Practicepack;

public class array {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,4,5,7},{4,8,7,5,6,8,4},{5,6,7,8,4}};
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

