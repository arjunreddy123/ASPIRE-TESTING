package Curser;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_1 
{
	public static void main(String[] args) 
	{
		
	LinkedList v=new LinkedList();
    v.add("Arjun");
    v.add("Reddy");
    v.add(77759777);
    v.add(92.56);
    v.add(null);
    v.add('A');
    v.add(true);
    v.add("ugile");
    v.add(null);
    v.add(0, "Latur");  // add element at the idex position
    v.add(1, "Udgir");
    
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
