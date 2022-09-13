package StringS;

import java.util.HashMap;
import java.util.HashSet;

public class duplicatestring 
{

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("arjun");
		hs.add("ram");
		hs.add("arjun");
		hs.add("arjun");
		hs.add("raju");
		hs.add("arjun");
		System.out.println(hs.contains("raju"));
		System.out.println(hs);
		

	}

}
