package practiceprogram;

public class reversestring 
{

	public static void main(String[] args) 
	{
		String a="Arjun Reddy";
		String[] word = a.split(" ");
		String reverseString ="";
		
		for(String w:word)
		{
			String reverseword = "";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);
			}
			reverseString=reverseString+reverseword+" ";
		}
		System.out.println(reverseString); 
		
	}
	
}
