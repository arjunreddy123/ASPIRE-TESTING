package Practicepack;

public class Stringbilder 
{

	public static void main(String[] args) 
	{
		String s="Arjun reddy ugile";
		String[] word = s.split(" ");
		String revword="";
		for(String w:word)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			revword=revword+sb.toString()+" ";
	   }
       System.out.println(revword);
	}

}
