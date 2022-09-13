package Curser;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Enumeration_1 
{
       public static void main(String[] args)
		{
	   Vector v=new Vector();
	    v.add("Arjun");
	    v.add("Reddy");
	    v.add(77759777);
	    v.add(92.56);
	    v.add(null);
	    v.add('A');
	    v.add(true);
	    v.add("ugile");
	    v.add(null);
	    v.add(0, "Latur");                  // add element at the idex position
	    v.add(1, "Udgir");
	  
	    Enumeration e=v.elements();
	    while(e.hasMoreElements())
	    {
	    	System.out.print(e.nextElement()+",");
	    }
	    System.out.println("\n");
	    
	    
	    Iterator itr=v.iterator();          //itreator curser
	    while(itr.hasNext())
	    {
	    	System.out.print(itr.next()+",");
	    }
	    System.out.println("\n");
	    
	    ListIterator ltr=v.listIterator();
	    while(ltr.hasNext())
	    {
	    	System.out.print(ltr.next()+",");
	    }
	    System.out.println("\n");
	    while(ltr.hasPrevious())
	    {
	    	System.out.print(ltr.previous()+",");
	    }
	    

	}

}
