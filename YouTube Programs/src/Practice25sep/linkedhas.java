package Practice25sep;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhas 
{

	public static void main(String[] args) 
	{
		LinkedHashSet al=new 	LinkedHashSet();
		al.add("abc");
 		al.add("xyz");
 		al.add("asd");
 		al.add("dfg");
 		al.add("ghj");
 		al.add("klm");
 		al.add("asd");
 		al.add("asd");
 		al.add(null);
 		al.add(100);
 		System.out.println(al);
 		Iterator itr=al.iterator();
 		while(itr.hasNext())
 		{
 			System.out.print(itr.next()+" ");
 		}
 		System.out.println("\nFor Each");
 		for(Object temp:al)
 		{
 			System.out.print(temp+" ");
 		}

	}

}
