package Practice25sep;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linklist 
{

	public static void main(String[] args) 
	{
		LinkedList al=new LinkedList();
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
		al.addFirst("akash");
		al.addLast("patil");
		//al.removeFirst();
		//al.removeLast();
		//al.removeAll(al);
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
