package Interview;

import java.util.ArrayList;

public class array 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("arjun");
		al.add("arjun");
		al.add("arjun");
		al.add("arjun");
		al.add("arjun");
		al.add("arjun");
		al.add("arjun");
		al.add("arjun");
		al.add("arjun");
		al.add("arjun");
		al.add("raju");
		al.add("arjun");
		al.add("7777");
		
	    
	    
	    al.add(5,"555");
	    al.add(5,"999");
	    System.out.println(al.lastIndexOf("arjun"));
	    System.out.println(al.indexOf("raju"));
	    System.out.println(al.get(6));
	    System.out.println(al.set(2,"arnav"));
	    System.out.println(al.remove(2));
	    System.out.println(al);
	    
	    System.out.println(al.size());
		


	}

}
