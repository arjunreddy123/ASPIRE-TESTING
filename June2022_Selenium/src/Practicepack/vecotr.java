package Practicepack;

import java.util.Enumeration;
import java.util.Vector;

public class vecotr 
{

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add("arjun");
		v.add("ram");
		v.add("akash");
		v.add("raju");
		v.add("gaju");
		v.add("1002");
		System.out.println(v);
		v.add("latur");
		Enumeration em=v.elements();
		while(em.hasMoreElements())
		{
			System.out.print(em.nextElement()+" ");
		}

	}

}
