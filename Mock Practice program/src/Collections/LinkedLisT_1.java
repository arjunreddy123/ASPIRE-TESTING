package Collections;

import java.util.LinkedList;

public class LinkedLisT_1 
{

	public static void main(String[] args) 
	{
		LinkedList nm=new LinkedList();
		nm.add("Arjun");
		nm.add("Arnav");
		nm.add("Reddy");
		nm.add(77759777);
		
		nm.addFirst("Udgir");
		nm.addLast("Latur");
		nm.add(6, "raju");
		
		//nm.remove(1);
		//nm.removeFirst();
		//nm.removeLast();
		
	
		System.out.println(nm);
		for(Object str:nm)
		{
			System.out.print(str+" ");
		}

	}

}
