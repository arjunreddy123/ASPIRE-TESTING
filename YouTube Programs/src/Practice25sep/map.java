package Practice25sep;

import java.util.HashMap;

public class map 
{

	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put(100,"arjun");
		hm.put(101, "arnav");
		hm.put(102, "aru");
		hm.put(103, "patil");
		hm.put(104, "vaisali");
		hm.put(105, "abc");
		System.out.println(hm);
		hm.remove(105);
		
		System.out.println(hm);
		hm.replace(104,"raju");
		System.out.println(hm.containsKey(106));
		System.out.println(hm.containsValue("aru"));
		System.out.println("Size="+hm.size());
		System.out.println(hm);
	}

}
