package StringS;

public class printsepratestringnnumber 
{

	public static void main(String[] args) 
	{
	    String str="arjun u77777";
	    String[] part = str.split("(?<=\\D)(?=\\d)");
	    System.out.println("string First="+part[0]);
	    System.out.println("string second="+part[1]);
	  

	}

}