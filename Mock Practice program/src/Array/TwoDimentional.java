package Array;

public class TwoDimentional 
{

	public static void main(String[] args) 
	{
		
		 
		int a[][]= {{1,2,3},{3,4,5},{4,7,8},{9,9,9}};
		
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		    
	        String B[][]= {{"ARJUN"},{"UGILE"},{"REDDY"}};
	        
	        for(int i=0;i<B.length;i++)
	        {
	        	for(int j=0;j<B[i].length;j++)
	        	{
	        		System.out.print(B[i][j]+" ");
	        	}
	        	System.out.println();
	        }
	       

		}

	}


