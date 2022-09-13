package StringS;

public class Stringbuilder 
{

	public static void main(String[] args) 
	{
		String s="Arjun Reddy Ugile";
		String[] word = s.split(" ");
		String reverseword="";
		for(String w:word)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseword = reverseword+sb.toString()+" ";
		}
		System.out.println(reverseword);
	}

}
