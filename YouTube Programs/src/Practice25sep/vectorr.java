package Practice25sep;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class vectorr 
{

	public static void main(String[] args) 
	{
         

		Vector al=new Vector();
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
 		System.out.println("\n ****Enumration****");
 		
 		Enumeration em=al.elements();
 		while(em.hasMoreElements())
 		{
 			System.out.print(em.nextElement()+" ");
 		}
 		System.out.println();
 		
 		System.out.println("\n ****Hasprevoius****");
 		ListIterator lit=al.listIterator(al.size());
		while(lit.hasPrevious())
		{
			System.out.print(lit.previous()+" ");
		}
        System.out.println();
        
		System.out.println("\n  itreator");
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n  for loop");
		for(  Object temp:al)
		{
			System.out.print(temp+" ");
		}
       System.out.println("\n ****HasNext****");
        
 		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+" ");
		}
 		

	}

}
