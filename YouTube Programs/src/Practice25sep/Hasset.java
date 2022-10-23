package Practice25sep;

import java.util.HashSet;
import java.util.Iterator;

public class Hasset 
{

	public static void main(String[] args) 
	{
		HashSet al=new HashSet();
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
 		al.add(20);
 		System.out.println(al);
 		
 		//al.remove("abc");
 		System.out.println(al.size());
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
