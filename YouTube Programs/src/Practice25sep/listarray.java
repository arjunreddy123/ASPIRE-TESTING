package Practice25sep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class listarray 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		System.out.println(al.isEmpty());
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
		al.remove(8);
		//System.out.println(al.size());
		//System.out.println(al.indexOf("asd"));
		//System.out.println(al.lastIndexOf("asd"));
		//System.out.println(al.set(0,"arjun"));
		//System.out.println(al.get(1));
		//System.out.println(al.isEmpty());
		//System.out.println(al.clone());
		//al.clear();
		
		//System.out.println(al);
		ListIterator lit=al.listIterator(al.size());
		while(lit.hasPrevious())
		{
			System.out.print(lit.previous()+" ");
		}
		
		System.out.println();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		for(  Object temp:al)
		{
			System.out.print(temp+" ");
		}
		
	
  
	}
}
