package Practicepack;

import java.util.HashMap;

public class Mapinterface 
{

	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put(101,"arjun");
		hm.put(102, "arnav");
		hm.put(103, "vaishali");
		hm.put(104, "vishal");
		hm.put(105, "ram");
		hm.put(106, "ram");
		hm.put(106, "akash");
		hm.put(107, "gopal");
		System.out.println(hm);
		hm.remove(107);
		System.out.println(hm);
		hm.remove(106,"akash");
		System.out.println(hm);
		hm.replace(104,"ajay");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.containsKey(106));
		System.out.println(hm.containsValue("ram"));
		
		System.out.println(hm.get(102));
	}

}
