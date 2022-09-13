package StringS;

public class countstring 
{

	public static void main(String[] args) 
	{
		String s="arjunarjun";
		char ch='a';
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		 System.out.println("The character '" + ch + "' found " + count + " times in a string '" + s+ "'.");
	}

}
