package StringS;

public class Trimmethod 
{

	public static void main(String[] args) 
	{
		String s="Arjun ugile";
	    int len=s.length();
	    System.out.println(len);
	    String tri = s.trim();
	    int siz = tri.length();
	    System.out.println(siz);
		System.out.println(s+"javaclass");//without trim
		System.out.println(s.trim()+"javaclass");//with trim

	}

}