package Practice25sep;

public class Stringreverse 
{

	public static void main(String[] args) 
	{
		String s= "Arjun ugile";
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
