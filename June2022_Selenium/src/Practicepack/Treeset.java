package Practicepack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Treeset 
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add("arjun");
		ts.add("ram");
		ts.add("akash");
		ts.add("raju");
		ts.add("gaju");
		ts.add("1002");
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		ts.remove("1002");
		
		System.out.println(ts);
		ts.add("swamisamrth");
//		for(Object t:ts)
//		{
//			System.out.print(t+" ");
//		}
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		

	}

}
