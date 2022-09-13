package Curser;

import java.util.ArrayList;
import java.util.Iterator;


public class Iterator_1 
{

	public static void main(String[] args)
	{
    ArrayList al=new ArrayList<>();
    al.add("Arjun");
    al.add("Reddy");
    al.add(77759777);
    al.add(92.56);
    al.add(null);
    al.add('A');
    al.add(true);
    al.add("ugile");
    al.add(null);
    al.add(0, "Latur");  // add element at the idex position
    al.add(1, "Udgir");
    
    
    Iterator itr=al.iterator();          //itreator curser
    while(itr.hasNext())
    {
    	System.out.print(itr.next()+",");
    }
    System.out.println("\n");
   
}

}
