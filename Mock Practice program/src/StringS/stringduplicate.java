package StringS;

public class stringduplicate 
{

	public static void main(String[] args) 
	{
		String s[]= {"java","c","c++","html","Java"};
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j>s.length;j++)
			{
				if(s[i]==s[j])
				{
					System.out.println("duplicate element found="+s[i]);
				}
			}
		}
		System.out.println("duplicate elemnt not found");
	

	}

}
