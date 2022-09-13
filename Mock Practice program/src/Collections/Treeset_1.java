package Collections;
import java.util.TreeSet;

public class Treeset_1
{

     public static void main(String[] args) 
	  {
    	 
		TreeSet nm=new TreeSet();
		nm.add("Arjun");
		nm.add("Arnav");
		nm.add("Udgir");
		nm.add("Latur");
		nm.add("Arnav");
		//nm.add('a');
		//nm.add(77759777);
		//nm.add(62.20);
		
	System.out.println(nm);
	for(Object str:nm)
	{
		System.out.print(str+" ");
	}
		
}

}
