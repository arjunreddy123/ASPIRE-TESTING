package Collections_Map;
import java.util.HashMap;

public class Hashmap 
{

	public static void main(String[] args) 
	{	
        HashMap <Integer,String>hm=new HashMap<Integer,String>();
        hm.put(101,"arjun");
        hm.put(102,"Vaishli");
        hm.put(103, "Arnav");
        hm.put(104,"Akash");
        hm.put(105, "arjun");
        hm.put(105,"raju");
        hm.put(106, "Amol");
        hm.put(107, "777");
        
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.containsKey(107));
        System.out.println(hm.containsValue("arjun"));
        System.out.println(hm.replace(105, "Shyam"));
        System.out.println(hm);
        System.out.println(hm.remove(106));
        System.out.println(hm);
        System.out.println(hm.remove(105,"Shyam"));
        System.out.println(hm);
        String a=(String) hm.get(102);
        System.out.println(a);
        //String b=hm.get(103);
        //System.out.println(b);
        
        
	}

}
