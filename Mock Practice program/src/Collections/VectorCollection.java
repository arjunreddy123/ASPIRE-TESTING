package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorCollection 
{
	
		public static void main(String[] args) 
		{
		Vector v = new Vector();
		System.out.println(v.isEmpty());
		v.add("Arjun");
		v.add("Ugile");
		v.add(987654321);
		v.add(92.56);
		v.add(null);
		v.add('A');
		v.add(true);
		v.add("Ugile");
		v.add(null);
		v.add(null);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.indexOf("ugile"));
		System.out.println(v.lastIndexOf("Ugile"));
		v.add("Aspire");
		System.out.println(v);
		v.remove(8);
		v.remove(8);
		System.out.println(v);
		v.set(7, 56.78);
		System.out.println(v);
		int a=10;
		int b=(int) v.get(2);
		int sum=a+b;
		System.out.println(sum);
		System.out.println(v.get(5));
	//foreach loop		
		System.out.println("foreach loop");
		for(Object i:v)
		{
			System.out.print(i+",");
		}
		System.out.println("\nfor loop");
	//for loop
		for(int j=0;j<v.size();j++)
		{
			System.out.print(v.get(j)+",");
		}
	//iterator cursor
		System.out.println("\nIterator cursor");
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
	//list_iterator cursor
		System.out.println("\n List_iterator cursor");
		ListIterator litr = v.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+",");
		}
		System.out.println("\n List_iterator cursor in reverse direction");
		ListIterator lirev = v.listIterator(v.size());
		while(lirev.hasPrevious())
		{
			System.out.print(lirev.previous()+",");
		}
		System.out.println("\n enumeration cursor");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+",");
		}
		}
	}


