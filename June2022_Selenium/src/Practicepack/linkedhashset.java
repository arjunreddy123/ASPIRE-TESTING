package Practicepack;

import java.util.HashSet;
import java.util.Iterator;

public class linkedhashset {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("arjun");
		hs.add("ram");
		hs.add("akash");
		hs.add("raju");
		hs.add("gaju");
		hs.add("1002");
		System.out.println(hs);
		hs.add("latur");
		//System.out.println(hs);
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
	}

}
