package Practicepack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("arjun");
		al.add("aru");
		al.add("rjun");
		al.add("jun");
		al.add("jully");
		al.add("august");
		al.add("september");
		al.add("octmber");
		al.add("december");
		al.add("novmber");
		al.add("janewari");
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(2));
		al.set(5, "rajkumar");
		al.remove(0);
		al.get(3);
		al.set(0,"Arvind");
		Iterator itr=al.iterator();
		while(itr.hasNext()) 
		{
			System.out.print(itr.next()+" ");
		}

		
		
	}

	
		
	}


