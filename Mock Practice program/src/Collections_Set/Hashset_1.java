package Collections_Set;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset_1 
{
public static void main(String[] args) 
{
	HashSet hs=new HashSet();
	hs.add("Arjun");
	hs.add("Ugile");
	hs.add(987654321);
	hs.add(92.56);
	hs.add(null);
	hs.add('A');
	hs.add(true);
	hs.add("Ugile");
	hs.add(null);
	hs.add(null);
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	hs.remove("Arjun");
	System.out.println(hs.contains('A'));
	for(Object i:hs)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
}
}
