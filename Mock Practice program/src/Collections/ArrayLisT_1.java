package Collections;

import java.util.ArrayList;

public class ArrayLisT_1 
{

	public static void main(String[] args) 
	{
		
     ArrayList<Object> al=new ArrayList<Object>();
     System.out.println(al.isEmpty());
     al.add("Arjun");
     al.add("Reddy");
     al.add(77759777);
     al.add(92.56);
     al.add(null);
     al.add('A');
     al.add(true);
     al.add("ugile");
     al.add(null);
     al.add(0, "Latur");                  // add element at the idex position
     al.add(1, "Udgir");
     
   
     System.out.println(al);
     System.out.println(al.size());
     System.out.println(al.isEmpty());
     System.out.println(al.indexOf("ugile"));
     System.out.println(al.lastIndexOf("Reddy"));
     
     al.remove(1);                      //elemnt remove krto inedx number deun.....
     al.remove("Arjun");                //elemnt remove krto element/object pass kaurn number deun
     al.clone();                        // copy the arrray elemnt....
     
    
     System.out.println(al);
     al.set(1,"ArnaV");                 //element replace karto set method ni
     System.out.println(al);
     System.out.println(al.get(7));    //get method ni index number deun elemnt gheto
     al.clear();                       // claer all the elemnt in the array
     System.out.println(al);
 	
     
}

}
