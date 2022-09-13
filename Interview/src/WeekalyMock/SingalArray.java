package WeekalyMock;

public class SingalArray 
{

	public static void main(String[] args) 
	{
	System.out.println("********Single Dimentional Array********");	
		String s[]=new String[5];
		s[0]="A";
		s[1]="R";
		s[2]="J";
		s[3]="U";
		s[4]="N";
		for(String a:s)
		{
			System.out.print(a);
		}
		System.out.println();
		
		for(int i=0;i<5;i++)
		{
			System.out.print(s[i]);
		}
	  System.out.println();
	
	 String W[]= {"REDDY FAMILY"};
     for(int i=0;i<1;i++)
		{
			System.out.print(W[i]);
		}
     System.out.println("\n");
     
 System.out.println("********Two Dimentional Array********");
 
	int a[][]= {{1,2,3},{3,4,5},{4,7,8},{9,9,9}};
	
	for(int i=0;i<a.length;i++)
	{
		for (int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
        String B[][]= {{"ARJUN"},{"UGILE"}};
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
